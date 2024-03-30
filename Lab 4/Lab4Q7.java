import java.util.Scanner;
public class Lab4Q7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i=0;
		char prev=s.charAt(0);
		//it is a method hence brackets complusory
		for(i=0;i<s.length();i++){ 
			//prev = s.charAt(0);
			for(int k=0;k<=i;k++)
			{ prev= s.charAt(k);
			  System.out.print(prev);
				
			}//to use charAt-> stringname.charAt()
		System.out.print("\n");
		sc.close();
		}
		
	}
}
		

	
