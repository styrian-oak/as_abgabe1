package berlin.tu.eecs;

public class App {
    public static void main(String[] args) {
        TxtReader file = new TxtReader("buecher/frankenstein.txt");
        System.out.println(file.getFilePath());
    }
}
