import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Library library=new Library();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\n====== Library Menu ======");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author=sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity=sc.nextInt();

                    library.addBook(new Book(id,name,author,quantity));
                    break;
                case 2:
                    library.displayBook();
                    break;
                case 3:
                    System.out.print("Enter Book Id to issue: ");
                    int issueId=sc.nextInt();
                    library.issueBook(issueId);
                    break;     
                case 4:
                    System.out.print("Enter Book Id to return: ");
                    int returnId=sc.nextInt();
                    library.returnBook(returnId);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}