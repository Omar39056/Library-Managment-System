package LibrarySystem;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Novel("omar", "dfjkf");
        Book b2 = new TextBook("habiba", "dsdg");

        b1.borrowBook();
        b1.printInfo();
        b2.printInfo();
        b1.returnBook();
        b1.printInfo();

    }
}
