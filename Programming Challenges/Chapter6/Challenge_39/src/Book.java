public class Book {
    /*39. Create a Book class for a library system.
          •Instance variables: title, author, isbn.
          •Static variable: totalBooks, a counter for the total number of book 
           instances.
          •Instance methods: borrowBook(), returnBook().
          •Static method: getTotalBooks(), to get the total number of books in the 
           library */
    String title;
    String author;
    int isbn;
    static int totalBooks;
    boolean isBorrowed;
    boolean isReturned;

    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Book(int isbn, String author, String title){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.isBorrowed = false;
    }

    Book(int isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    void borrowBook(){
        if(!this.isBorrowed){
            System.out.println("Book Borrowed.");
            this.isBorrowed = true;
            this.isReturned = false;
            totalBooks--;
        }else{
            System.out.println("Book is already Borrowed.");
        }
    }

    void returnBook(){
        if(isReturned == false){
            System.out.println("Book Returned.");
            this.isReturned = true;
            totalBooks++;
        }else{
            System.out.println("The Book is Already Returned.");
        }
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    public static void main(String[] args) {
        Book myBook1 = new Book(1,"MySelf","AnyThing");
        System.out.println(Book.getTotalBooks());
        myBook1.borrowBook();
        myBook1.borrowBook();
        System.out.println(Book.getTotalBooks());
        myBook1.returnBook();
        myBook1.returnBook();
        Book myBook2 = new Book(2);
        System.out.println(Book.getTotalBooks());
    }
}
