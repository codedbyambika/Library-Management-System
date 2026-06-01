public class Book{
    int id;
    String name;
    String author;
    int quantity;

    public Book(int id, String name, String author, int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.quantity=quantity;
    }

    public void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
        System.out.println("Copies: "+quantity);
    }
}