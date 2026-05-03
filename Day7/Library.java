

public class Library {
    //Outer class variable
    private String libaryName;
    //constructor for library class
    public Library(String libaryName) {
        this.libaryName = libaryName;
    }
    //inner class representing a book
    class Book {
        private String title;
        private String author;
        // constructor for book class
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
        // Method to display book details
        public void display() {
            System.out.println("Library: " + libaryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }
}
