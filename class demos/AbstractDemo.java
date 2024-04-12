abstract class AbstractNew{
     abstract class neew{
        abstract void display();
    }
    abstract void meth();
}
class NewAbs extends AbstractNew{
   public void display(){
        System.out.println("hi");   
    }
    public void meth(){

    }
}                           
public class AbstractDemo{
    public static void main(String[] args){
        NewAbs aa = new NewAbs();
        aa.display();
    }    
}
