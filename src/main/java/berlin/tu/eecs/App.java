package berlin.tu.eecs;

public class App {
    public static void main(String[] args) {
        TxtReader file = new TxtReader("buecher/frankenstein.txt");
        System.out.println(file.getFilePath());
        for (String line : file.getLines()) {
            System.out.println(line);
        }
    }
}
