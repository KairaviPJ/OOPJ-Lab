import java.util.Scanner;
class Student{
    String name;
    String rollNo;
    int percentage;
    public Student(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();//this keyword not used because 1)it is in same class where it is declared 2)no local variable of same name
        System.out.println("Enter percentage: ");//i.e. no same variable as parameter
        percentage = sc.nextInt();
        sc.close();
    }
    public void printStudentDetails(){
        System.out.println(name+" got "+percentage);
    }
}
public class ArrayObj {
    public static void main(String[]args){
        // Student stu1 = new Student(2);
        // Student stu2 = new Student(3);
        Student [] stu = new Student[10];
       // System.out.println(stu[0].name);//gives null pointer exception currently only stack created with all the memory addresses of the array student
        //stu[0] = new Student(i+1);//memory allocated in heap memory
        for(int i=0;i<stu.length;i++){
            stu[i] = new Student(i+1);

        }
        for(int i=0;i<stu.length;i++){
            if(stu[i].percentage>80){
                stu[i].printStudentDetails();
            }
        }
        
    }
    
}
