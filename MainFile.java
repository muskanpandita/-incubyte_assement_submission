package repo;

public class MainFile {
    public static void main(String args[]){
        LibraryTest test=new LibraryTest();
        test.add();
        test.test_add_book();

        test.test_borrow_book();
        test.test_borrow_book_not_Available();
 
        test.test_return_book();
        System.out.println("Test Passed");

        test.test_view_avaliable_books();
    }
}

