import java.util.ArrayList;

public class Library{
    ArrayList<Book> books=new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void displayBook(){
        if(books.isEmpty()){
            System.out.println("No books available in the library.");
            return;
        }
        for(Book book:books){
            book.display();
        }
    }
    
    public void issueBook(int id){
        for(Book b:books){
            if(b.id==id){
                if(b.quantity>0){
                    b.quantity--;
                    System.out.println("Book issued successfully!");
                    System.out.println("Remaining copies: "+b.quantity);
                }else{
                    System.out.println("No copies available for this book.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int id){
        for(Book b:books){
            if(b.id==id){
                b.quantity++;
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

