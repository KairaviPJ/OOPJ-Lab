 import java.util.Scanner;
 class Bank_Account{
    String accountNo;
    String userName;
    String email;
    String accountType;
    double accountBalance;

public void getAccountDetails(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter username:");
    userName = sc.nextLine();
    System.out.print("\nEnter email: ");
    email = sc.next();
    System.out.print("\nEnter account type: ");
    sc.nextLine();//string cannot be read after int so this statement is written to clear buffer
    accountType = sc.nextLine();
    System.out.print("\naccountNo: ");
    accountNo = sc.next();
    System.out.print("\nEnter account balance: ");
    accountBalance = sc.nextDouble();
    sc.close();
}

public void displayAccountDetails(){
    System.out.print("Username: "+userName);
    System.out.print("\nEmail: "+email);
    System.out.print("\nAccount no: "+accountNo);
    System.out.print("\nAccount type: "+accountType);
    System.out.print("\nAccount balance: "+accountBalance);
}
}
public class Bank{
    public static void main(String[]a){
    Scanner sc = new Scanner(System.in);
    Bank_Account b1 = new Bank_Account();
    Bank_Account b2 = new Bank_Account();
     b1.getAccountDetails();
     b1.displayAccountDetails();
    b2.userName = "Qwerty";
    b2.displayAccountDetails();
    sc.close();
    }
}