package LibrarySystem;

public class TextBook extends Book implements Borrowable {

    public TextBook(String author, String title) {
        super(author, title);
    }

    @Override
    public void borrowBook() {
        setIsBorrowed(true);
    }
    @Override
    public void returnBook() {
        setIsBorrowed(false);
    }
}
