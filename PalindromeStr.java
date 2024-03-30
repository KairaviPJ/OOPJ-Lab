import java.util.Scanner;
public class PalindromeStr{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i=0;
		for(i=0;i<s.length()/2;i++)
		{	int j=s.length()-i-1;
			if(s.charAt(i)!=s.charAt(j)){ 
				System.out.println("The given string is not Palindrome");
				return;
			}
		}
		System.out.println("The given string is Palindrome");
	}
}