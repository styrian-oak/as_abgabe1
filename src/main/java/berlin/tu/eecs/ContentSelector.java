package berlin.tu.eecs;

import java.util.List;

public class ContentSelector {

    public static List<String> selectLinesRange(List<String> lines, int start, int end) {

        if (start < 1 || end > lines.size() || start > end) {
            throw new IllegalArgumentException("Ungültiger Bereich");
        }

        return lines.subList(start - 1, end);
    }
}
