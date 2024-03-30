public class CheckCommand{
	public static void main(String[]args){
		String s = args[0];
		char m = s.charAt(0);
		if(m>=65 && m<=91){System.out.println("Execution successful");}
		else{System.out.println("Error:The argument does not begin with an uppercase letter");}
	}
}