import java.util.Scanner;
public class Prime_In_Range{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a,b,i,count=0,j=1;
		System.out.print("Enter 2 integers to find prime numbers between them: ");
		a = sc.nextInt();
		b = sc.nextInt();
		for(i=a;i<=b;i++){count=0;//if this is not written then it wud keep adding to existing count from previous iteration

			for(j=1;j<=i;j++){

				if(i%j==0){count++;}
				}
			if(count==2){System.out.print(i+" ");}
			}


	}
}