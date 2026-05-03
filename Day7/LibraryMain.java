

public class LibraryMain {
    public static void main(String[] args) {
        // create an instance of library
        Library myLibrary = new Library("City Library");
        // create an instance of book using outer class instance
        Library.Book myBook = myLibrary.new Book("1984", "George Well");
        // Display book information
        myBook.display();
    }
}
