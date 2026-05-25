package berlin.tu.eecs;

import java.util.List;

public class App {

    public static void main(String[] args) {
        String path = "buecher/frankenstein.txt";

        List<String> content = TxtReader.getTxtList(path);
        //String content = TxtReader.getTxtString(path);

        /*
        // Weiterverarbeitung passiert hier
        for (String line : content) {
            System.out.println(line);
        }
        */
        //System.out.println(content);

        System.out.println(ContentAnalyzer.countWords(content));

        //List<String> selection = ContentSelector.selectLinesRange(content, 5, 10);
        List<String> selection = ContentSelector.selectLinesString(content, "castle");

        for (String line : selection) {
            System.out.println(line);
        }
    }
}
