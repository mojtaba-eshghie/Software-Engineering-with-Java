// Delegation Principle

public class Delegation {
    public static void main(String[] args) {
        PrinterClass printer = new PrinterClass();
        printer.print("hello world"); // let's delegate!
    }
}

class PrinterClass {
    // This is going to be the delegated class
    void print(String smt_to_print) {
        System.out.println(smt_to_print);
    }
}
