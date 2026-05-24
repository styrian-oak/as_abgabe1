package berlin.tu.eecs;

public class App {
    public static void main(String[] args) {
        String bookPath = "buecher/frankenstein.txt";
        String text = BookReader.getBookText(bookPath);
        System.out.println(text);
    }
}
