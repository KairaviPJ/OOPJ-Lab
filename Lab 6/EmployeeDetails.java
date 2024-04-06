class Member{
    String name;
    int age;
    int phone_number;
    String address;
    int salary;

    Member(){

    }
    public void printSalary(int Salary){
        // this.salary = salary;//only required when salary has to be used somewhere
        System.out.println("Salary: "+Salary);
    }    
}
class Employee extends Member{
    // Employee();
    String specialization="Cyber security";
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone number: "+phone_number);
        System.out.println("Specialization: "+specialization);

    }   
}
class Manager extends Member{
    // public Manager();
    String department="Logistics";
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone number: "+phone_number);
        System.out.println("Department: "+department);
    }   
}
public class EmployeeDetails {
    public static void main(String[]args){
    Employee e1 = new Employee();
    e1.name="abc";
    e1.age=25;
    e1.phone_number=88745578;
    e1.printDetails();
    e1.printSalary(60000);
    Manager m1 = new Manager();
    m1.name="xyz";
    m1.age=24;
    m1.phone_number=99787;
    m1.printDetails();
    m1.printSalary(70000);
    }
}