class MovingObject{
    public MovingObject(){
        System.out.println("Default Moving Object");
    }
    public MovingObject(int n){
        System.out.println("Parameterized Moving Object");
    }
}
class Vehicle extends MovingObject{
    public Vehicle(){ 
        System.out.println("Default Vehicle");
    }
    public Vehicle(int n){ super(2);
        System.out.println("Parameterized Vehicle");
    }
}
class Car extends Vehicle{
    public Car(){ this(2);
        System.out.println("Default Car");
    }
    public Car(int n){ super(2);
        System.out.println("Parameterized Car");
    }
}
public class ConstructorInheritance{
    public static void main(String[] args) {
        Car v1 = new Car();
        System.out.println("good bye hare krsna");
        Vehicle v2 = new Vehicle();
    }  
}