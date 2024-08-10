package repo;
import java.util.*;

public class Book {
    String ISBN;
    String title;
    String author;
    int publicationYear;
    boolean borrowBooks;

public Book(String ISBN, String title, String author, int publicationYear){
    this.ISBN=ISBN;
    this.title=title;
    this.author=author;
    this.publicationYear=publicationYear;
    this.borrowBooks=false; 
}

public String getISBN(){
    return ISBN;
}

public String getTitle(){
    return title;
}

public String getAuthor(){
    return author;
}

public int getPublicationYear(){
    return publicationYear;
}

public boolean borrowBooks(){
    return borrowBooks;
}

public void setBorrowed(boolean Borrowed){
    borrowBooks= Borrowed;
}

}
