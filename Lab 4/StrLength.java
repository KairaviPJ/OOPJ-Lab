import java.util.Scanner;
public class StrLength{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i=0;
		System.out.print("The length of the string is: "+(s.length()));
		System.out.print("\nSecond half of the string:");
		for(i=(s.length())/2;i<s.length();i++){
			System.out.print(s.charAt(i));
			sc.close();
		}
		
	}
}