import java.util.Scanner;
class Circle{
	double radius;

	double Area(){
		double area = 3.14*(radius)*(radius);
		return area;
		//System.out.println("The area of the circle is: "+area);
	}
}


public class CircleNew{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		Circle c1 = new Circle();
		c1.radius = sc.nextDouble();
		
		double area = c1.Area();
		System.out.println(+area);
		sc.close();
	}
}