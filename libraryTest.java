package repo;
import java.util.*;
public class LibraryTest {
    Library library;
    Book book; //book is used

    public void add(){
        library= new Library();
        //isbn, title, author, Pyear
        book=new Book("978-8171673400","Godaan","Munshi Premchand",1936);
    }

    public void test_add_book(){
        library.addBook(book);
        assert(library.getBook().contains(book));
    }

    public void test_borrow_book(){
        library.addBook(book);
        assertTrue(Library.borrowBook("978-8171673400"));
        assertTrue(book.borrowBooks());
    }

    public void test_borrow_book_not_Available(){
        library.addBook(book);
        library.borrowBook("978-8171673400");
        library.borrowBook("4638756386");

    }

}
