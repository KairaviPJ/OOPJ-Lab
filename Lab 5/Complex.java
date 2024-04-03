import java.util.Scanner;
class ComplexNo{
    String []imag;
    int real;
ComplexNo(){//default constructor has to be defined if more constructors are
//created
}
ComplexNo(String imag,int real){  
}
ComplexNo(int real){

}
ComplexNo(String name){

}
public void addComplexNumbers(int real,int imag){
    int ans = real+imag;
}
}
public class Complex{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ComplexNo n1 = new ComplexNo("22i",2);
        ComplexNo n2 = new ComplexNo();
        // System.out.print("Enter real part of 1st complex numeber");
        // n1.real = sc.nextInt();
        // System.out.print("Enter imaginary part of 1st complex number:");
        //n1.imag[0]= "22i";
        // n1.imag[0] = sc.nextInt();
        int img = Integer.parseInt(n1.imag[0]);
        System.out.print(n1.imag);
        sc.close();
       
       
    }
}
