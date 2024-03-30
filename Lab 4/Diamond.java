import java.util.Scanner;
public class Diamond{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a positive integer: ");
		n = sc.nextInt();
		int i=1,j=1,k=(2*n)-1;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(i=((2*n)-1)/2;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}
}