import java.util.Scanner;
public class Vowel{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line (without white space) to check vowels and consonants");
		String s = sc.next();
		int i=0,vowel=0,cons=0;
		char c = s.charAt(0);
		sc.close();
		for(i=0;i<s.length();i++){ c = s.charAt(i);
			if(c=='A'||c=='a'||c=='E'||c=='e'||c=='i'||c=='I'||c=='u'||c=='U'||c=='o'||c=='O'){
				vowel++;
			}
			else{cons++;}
		}
		System.out.println("No of vowels:"+vowel+" and the no of consonants: "+cons);
		


	}
}