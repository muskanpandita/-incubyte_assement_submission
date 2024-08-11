**Library Management System:**  

__Overview:__  
The Library Management System is a simple Java application that simulates basic library operations such as adding books, borrowing books, returning books, and viewing available books. The project is implemented using Java with a focus on Test-Driven Development (TDD) principles. The classes are organized under the repo package.

**Classes:**  

__Book:__  
The Book class represents a book in the library. Each book has the following attributes:  
ISBN: A unique identifier for the book.  
title: The title of the book.  
author: The author of the book.  
publicationYear: The year the book was published.  
borrowBooks: A boolean flag indicating whether the book is currently borrowed.  

__Methods:__  
Book(String ISBN, String title, String author, int publicationYear): Constructor to initialize a new book.  
getISBN(): Returns the ISBN of the book.  
getTitle(): Returns the title of the book.  
getAuthor(): Returns the author of the book.  
getPublicationYear(): Returns the publication year of the book.  
borrowBooks(): Returns the borrow status of the book.  
setBorrowed(boolean borrowed): Sets the borrow status of the book.  

__Library:__  
The Library class manages a collection of books and provides methods for library operations.

__Attributes:__  
books: A list of Book objects representing the library's collection.

__Methods:__  
Library(): Constructor to initialize a new library with an empty list of books.  
addBook(Book book): Adds a new book to the library if it is not already present.  
getBook(): Returns a list of all books in the library.  
borrowBooks(String ISBN): Allows borrowing a book by its ISBN. Returns true if the book is successfully borrowed, and false if the book is not available or already borrowed.  
returnBook(String ISBN): Allows returning a borrowed book by its ISBN.  
view_available_books(): Returns a list of all available books that are not currently borrowed.  

__LibraryTest:__  
The LibraryTest class contains test cases to validate the functionality of the Library and Book classes using assertions.  

__Methods:__  
add(): Initializes the Library and a sample Book object for testing.  
test_add_book(): Tests the addition of a book to the library.  
test_borrow_book(): Tests borrowing a book from the library.  
test_borrow_book_not_Available(): Tests borrowing a book that is not available.  
test_return_book(): Tests returning a borrowed book to the library.  
test_view_available_books(): Tests viewing the list of available books in the library.  

__MainFile:__
The MainFile class contains the main method, which executes the test cases defined in the LibraryTest class.  

__Methods:__
main(String args[]): Executes all test methods and prints "Test Passed" if all tests succeed.  


__How to Run:->__
Compile all Java files in the repo package:  
javac -d . repo/*.java  

__Run the MainFile class:->__  
java repo.MainFile  

:->If all tests pass, you will see the message "Test Passed" in the console. 

**Conclusion:**  
This Library Management System demonstrates the use of Java for managing a collection of books with TDD principles. The application is designed to be simple and focused on core library operations, with an emphasis on clean code and effective testing.  
