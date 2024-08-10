package repo;
import java.util.*;

public class Library {
    List<Book> books; //books is used

    public Library(){
        this.books=new ArrayList<>();
    }

    public void addBook(Book book){
        if(!books.contains(book)){
            books.add(book);
        }
    }

    public List<Book> getBook(){
        return new ArrayList<>(books);
    }
}
