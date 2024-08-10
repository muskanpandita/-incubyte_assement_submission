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
        assert(library.borrowBooks("978-8171673400"));
        assert(book.borrowBooks());
    }

    public void test_borrow_book_not_Available(){
        library.addBook(book);
        library.borrowBooks("978-8171673400");
        library.borrowBooks("4638756386");

    }

    public void test_return_book(){
        library.addBook(book);
        library.borrowBooks("978-8171673400");
        library.returnBooks("978-8171673400");
        assert(book.borrowBooks());
    }
}

