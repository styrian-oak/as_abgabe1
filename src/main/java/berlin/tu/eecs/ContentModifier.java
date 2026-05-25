package berlin.tu.eecs;

import java.util.List;

public class ContentModifier {

    public static String normalizeString(String text) {
        return text
                .toLowerCase()

                // https://www.geeksforgeeks.org/java/how-to-remove-all-non-alphanumeric-characters-from-a-string-in-java/
                // \p{L} in Quelle nicht enthalten!
                //.replaceAll("[^a-z0-9\\s]", "");
                .replaceAll("[^\\p{L}0-9\\s]", "");
    }

    public static List<String> normalizeList(List<String> lines) {
        return lines.stream()
                .map(line -> normalizeString(line))
                .toList();
    }
}
