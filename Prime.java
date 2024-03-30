import java.util.Scanner;

public class Prime{
	public static void main(String[]args){
		int n,i=0;
		System.out.println("Enter integer to check prime: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0){System.out.println("Not Prime");
				return;}//ends the code here		
		}
		System.out.println("Prime");
	}
}