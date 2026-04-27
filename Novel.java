package LibrarySystem;

public class Novel extends Book implements Borrowable {


    public Novel(String author, String title) {
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
