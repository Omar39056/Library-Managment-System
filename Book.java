package LibrarySystem;

public abstract class Book {
    private String title;
    private String author;
    private Boolean isBorrowed;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(Boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.isBorrowed = false;

    }






    public void printInfo() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Borrowed: " + this.getBorrowed());
    }

    public abstract void borrowBook();
    public abstract void returnBook();
}
