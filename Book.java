package repo;
import java.util.*;

public class Book {
    String ISBN;
    String title;
    String author;
    int publicationYear;

public Book(String ISBN, String title, String author, int publicationYear){
    this.ISBN=ISBN;
    this.title=title;
    this.author=author;
    this.publicationYear=publicationYear;
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

public int getPublicationString(){
    return publicationYear;
}

}
