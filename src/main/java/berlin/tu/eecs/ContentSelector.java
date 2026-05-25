package berlin.tu.eecs;

import java.util.ArrayList;
import java.util.List;

public class ContentSelector {

    public static List<String> selectLinesRange(List<String> lines, int start, int end) {

        if (start < 1 || end > lines.size() || start > end) {
            throw new IllegalArgumentException("Ungültiger Bereich");
        }

        return lines.subList(start - 1, end);
    }

    public static List<String> selectLinesString(List<String> lines, String searchString) {
        List<String> result = new ArrayList<>();

        for (String line : lines) {

            // Groß-/Kleinschreibung nicht berücksichtigen:
            //if (line.contains(searchString)) {
            if (line.toLowerCase().contains(searchString.toLowerCase())) {
                result.add(line);
            }
        }

        return result;
    }
}
