import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
        int n1=0,n2=0,ans;
        Scanner sc = new Scanner(System.in);
        // try {
        // System.out.println("Enter number 1: ");
        // n1 = sc.nextInt();
        // System.out.println("Enter number 2:");
        // n2 = sc.nextInt();
        //     try{
        //         ans = n1/n2;
        //         System.out.println(ans);
        //     }
        //     catch(Exception e){
        //         System.out.println("Good bye");        
        //     }
        // } 
        // catch (Exception e) {
        //    System.out.println("Enter integer as input");
        // }
        
        try{
        System.out.println("Enter number 1: ");
        n1 = sc.nextInt();
        System.out.println("Enter number 2:");
        n2 = sc.nextInt();
        ans=n2/n1;
        System.out.println(ans);
        }
        catch(InputMismatchException im){
            System.out.println("Please enter integer data: ");
        }
        catch(ArithmeticException ae){
            System.out.println("Cannot divide by zero");
        }
        sc.close();
        }
    }

//if n2 is 0 -->Exception in thread "main" java.lang.ArithmeticException: / by zero
// if in first catch block Exception is written then in subsequent blocks specific exception written then it would
//not allow--> "message": "Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception",