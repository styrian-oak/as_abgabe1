package berlin.tu.eecs;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;

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

    public static List<String> combineSelections(
            List<String> lines,
            int start,
            int end,
            String searchString) {

        Set<String> result = new LinkedHashSet<>();

        // Ergebnisse der Range-Auswahl hinzufügen
        result.addAll(selectLinesRange(lines, start, end));

        // Ergebnisse der String-Suche hinzufügen
        result.addAll(selectLinesString(lines, searchString));

        // List<String> zurückgeben für konsistente API
        //return result;
        return new ArrayList<>(result);
    }
}
