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

    public boolean borrowBooks(String ISBN){
        for(Book book :  books){
            if(book.getISBN().equals(ISBN)){
                if(!book.borrowBooks()){
                    book.setBorrowed(true);
                    return true;
                }
                else{
                    System.out.println("Book is already Borrowed");
                }
            }
        }
        return false;
}

public void returnBook(String ISBN){
    for(Book book:books){
        if(book.getISBN().equals(ISBN)){
            if(book.borrowBooks()){
                book.setBorrowed(false);
                return;
            }
            else{
                System.out.println("Sorry, Book was not borrowed");
            }
        }
    }
}
}
