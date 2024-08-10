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

}
