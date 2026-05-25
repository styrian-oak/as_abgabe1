package berlin.tu.eecs;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TxtReader {
    private @Getter String filePath;
    private List<String> lines;

    // Kein Lombok-Konstruktor mögl., weil wir Pfad für getTxtList-Aufruf
    // brauchen
    public TxtReader(String filePath) {
        this.filePath = filePath;

        // Speichere Inhalt zur weiteren Verarbeitung
        this.lines = getTxtList(filePath);
    }

    // Lese Inhalt Zeile für Zeile ein (Stream wird autom. geschlossen)
    public static List<String> getTxtList(String path) {
        List<String> content = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                content.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
