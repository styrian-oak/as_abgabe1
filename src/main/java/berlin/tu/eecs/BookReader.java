package berlin.tu.eecs;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BookReader {

    // nimmt Dateipfad (als String) als Parameter und gibt Inhalt der Datei als
    // String zurück
    public static String getBookText(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = null;

            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
