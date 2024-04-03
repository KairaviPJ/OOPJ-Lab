import java.util.Scanner;
class Ask{
	String s;
	int count;
int Count(Ask a1){
	char c = (a1.s).charAt(0);
    int i=0;
    for(i=0;i<(a1.s).length();i++){
    	c = (a1.s).charAt(i);
    	if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'){a1.count++;}
    	}
    	return a1.count;
    }
}
public class AskDemo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence(Enter\"quit\"to terminate):");
		Ask a1 = new Ask();
		a1.s = sc.nextLine();
		int count = a1.Count(a1);
		System.out.print(count-2);
		sc.close();



	}
}