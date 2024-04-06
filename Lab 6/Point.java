import java.math.*;
class Mypoint{
	double x;
	double y;
	public Mypoint(){
		this.x = 0;
		this.y = 0;
	}
	public Mypoint(double x,double y){
		this.x = x;
		this.y = y;
	}
	// public Mypoint(int x,int y){
	// 	this.x =2;
	// 	this.y= 4;
	// }
	public void calculateDistance(Mypoint p1){
		double ans = Math.sqrt(Math.pow((this.x-p1.x),2)+Math.pow((this.y-p1.y),2));
		System.out.println(ans);
	}
}
class ThreeDPoint extends Mypoint{
	double z;
	public ThreeDPoint(){
		this.x =0;
		this.z=0;
		this.y=0;
	}
	public ThreeDPoint(double x,double y,double z){
		this.x =x;
		this.y=y;
		this.z=z;
	}
	public double get(double z){
		this.z = z;
		return z;
	}
	public void calculateDistance(ThreeDPoint p1){
		double ans = Math.sqrt(Math.pow(this.x-p1.x, 2)+Math.pow(this.y-p1.y, 2)+Math.pow(this.z-p1.z,2));
		System.out.println(ans);
	}
}

public class Point{
	public static void main(String[]args){
		Mypoint p1 = new Mypoint(2,1);
		Mypoint p2 = new Mypoint(0,0);
		p2.calculateDistance(p1);
		ThreeDPoint t1 = new ThreeDPoint();
		ThreeDPoint t2 = new ThreeDPoint(10, 30, 25.5);
		t2.calculateDistance(t1);
	}
}