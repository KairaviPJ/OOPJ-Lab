class MovingObj{
    int noOfGears =2;
}
class Vehicel extends MovingObj{
    int noOfGears = 5;
}
class Car1 extends Vehicel{
    
    int noOfGears = 10;
    public void printGear(){
        int noOfGears = 15;
        System.out.println(noOfGears);
        System.out.println(this.noOfGears);
        System.out.println(super.noOfGears);
    }
}
public class SuperDemo{
    public static void main(String[] args) {
        Car1 v1 = new Car1();
        v1.printGear();
    }
}