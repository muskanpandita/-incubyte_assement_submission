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
        library.returnBook("978-8171673400");
        assert(book.borrowBooks());
    }

    public void test_view_avaliable_books(){
        library.addBook(book);
        Book book1=new Book("978-8126706350","Kamayani","Jaishankar Prasad",1936);
        library.addBook(book1);

        List<Book> availableBooks= library.view_available_books();
        assert availableBooks.size()== 2;
        assert availableBooks.get(0).getTitle().equals("Godaan");
        assert availableBooks.get(1).getTitle().equals("Kamayani");
        
    }
}

