import model.Printer;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.print();

        Printer black = new Printer();
        black.print("black");

        Printer colored = new Printer();
        colored.print("red", "green", "blue");

    }
}
