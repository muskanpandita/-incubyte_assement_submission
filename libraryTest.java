package repo;

public class libraryTest {
    library library;
    Book book;

    public void add(){
        library= new library();
        //isbn, title, author, Pyear
        book=new Book("978-8171673400","Godaan","Munshi Premchand","1936");
    }

    public void test_add_book(){
        library.addBook(book);
        assert(library.getBook().contains(book));
    }

}
