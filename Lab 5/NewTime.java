import java.util.Scanner;
class Time{
	int hour;
	int min;
	int sec;
 Time(){hour=0;
 		min=0;}//constructor of class time
void addTime(Time t1,Time t2){
		Time t3 = new Time();
		t3.hour = t1.hour+t2.hour;
		t3.min = t1.min+t2.min;
		t3.sec = t1.sec+t2.sec;

		if(t3.sec>=60){
			t3.sec=t3.sec-60;
			t3.min+=1;}
		if(t3.min>=60){
			t3.min=t3.min-60;
			t3.hour+=1;}

		System.out.print(t3.hour+":"+t3.min+":"+t3.sec);

}	
}
public class NewTime{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	Time t1 = new Time();
	Time t2 = new Time();
	System.out.print("Enter time 1 in hours,minutes and seconds: ");
	t1.hour = sc.nextInt();
	t1.min = sc.nextInt();
	t1.sec = sc.nextInt();
	System.out.print("Enter time 2 in hours,minutes and seconds: ");
	t2.hour = sc.nextInt();
	t2.min = sc.nextInt();
	t2.sec = sc.nextInt();

	t1.addTime(t1,t2);
	sc.close();
	}
}