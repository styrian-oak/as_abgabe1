package berlin.tu.eecs;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TxtReader {

    public static List<String> getTxtList(String path) {
        List<String> contentLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = reader.readLine()) != null) {
                contentLines.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentLines;
    }

    public static String getTxtString(String path) {
        StringBuilder contentString = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = reader.readLine()) != null) {
                contentString.append(line).append(System.lineSeparator());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentString.toString();
    }
}
