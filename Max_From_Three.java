import java.util.Scanner;
public class Max_From_Three{
	public static void main(String[]args){
		int a,b,c,max=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three integers to check maximum integer: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		max=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("Maximum number is: "+max);
	}
}