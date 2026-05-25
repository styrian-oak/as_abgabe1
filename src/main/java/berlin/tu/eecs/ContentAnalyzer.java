package berlin.tu.eecs;

import java.util.ArrayList;
import java.util.List;

public class ContentAnalyzer {

    // https://medium.com/@AlexanderObregon/counting-words-in-a-sentence-with-java-332118a0081d
    public static int countWords(List<String> lines) {
        int count = 0;

        for (String line : lines) {
            if (line != null && !line.isBlank()) {
                String[] words = line.trim().split("\\s+");
                count += words.length;
            }
        }

        return count;
    }
}
