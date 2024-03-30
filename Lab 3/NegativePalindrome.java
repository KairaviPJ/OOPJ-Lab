import java.util.Scanner;
public class NegativePalindrome{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n,temp=0,i=0,r=0;
		System.out.println("Enter a negative integer to check palindrome: ");
		n = sc.nextInt();
		temp=n;
		while(n!=0){
			r =n%10;
			i=(i*10)+r;
			n=n/10;
		}
		System.out.println(n);
		if(temp==i){System.out.println("The number is Palindrome");}
		else{ System.out.println("The number is not Palindrome");}
	}
}
