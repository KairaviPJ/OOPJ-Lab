import java.util.Scanner;

class Book{
    Scanner sc = new Scanner(System.in);
    private String author_name;
    int publication_yr;
    public Book(String s){
        // System.out.println("Enter author name");
        // author_name = sc.nextLine();
        this.author_name=s;
    }
    public void print(){
        System.out.print(author_name);
    }
}
class Book_Publication extends Book{
    private String title;
    Book_Publication(String author_name,String title)
    {
        super(author_name);
        this.title=title;
    }
    public void print(){
        super.print();
        System.out.println(title);
    }
}
class Paper_Publication extends Book{
    private String title;
    public Paper_Publication(String author_name,String title){
        super(author_name);
        this.title = title;
    }
    public void print(){ //if method is not overrriden, it would not work
        super.print();
        System.out.println(title);
    }
}
public class BookMain{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book or publication to obtain required details: ");
        String input = sc.next();
        Book b;
        if(input.equalsIgnoreCase("book")){
        b = new Book_Publication("abc","Book1");
        b.print();
        }
        else if(input.equalsIgnoreCase("publication")){
        b = new Paper_Publication("abc","paper1");
        b.print();
        }
    }
}

