import java.util.Scanner;
class Student{
    int id_no;
    int no_of_subjects_registered;
    int [] subject_code;
    int [] subject_credit;
    String [] grade_obtained;
    double spi;

    Scanner sc = new Scanner(System.in);
    public Student(int i){
        System.out.println("Enter student ID for student "+(i+1)+":");
        id_no = sc.nextInt();
        System.out.println("Enter number of subjects registered:");
        no_of_subjects_registered = sc.nextInt();
        subject_code  = new int[no_of_subjects_registered];//only give size here do not create new array
        subject_credit = new int [no_of_subjects_registered];
        grade_obtained = new String [no_of_subjects_registered];

        for(int j=0;j<no_of_subjects_registered;j++){ 
            System.out.println("Enter subject code");
            subject_code[j] = sc.nextInt();
            System.out.println("Enter subject credit");
            subject_credit[j] = sc.nextInt();
            System.out.println("Enter grade obtained");
            grade_obtained[j] = sc.next();
        }
    }
        
    int grade_points=0,i=0,sum=0;
    
    public double calculateSpi(){
        for(i=0;i<no_of_subjects_registered;i++){
            if(grade_obtained[i].equals("A")){
                grade_points=10;
            }
            else if(grade_obtained[i].equals("B")){
                grade_points=9;
            }
            else if(grade_obtained[i].equals("C")){
                grade_points=8;
            }
            else if(grade_obtained[i].equals("D")){
                grade_points=7;
            }
        spi+=(subject_credit[i]*grade_points);
        sum+=subject_credit[i];
        }
        double ans = spi/sum;
        return ans;
        
    }
}
public class Spi{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        Student []s = new Student[n];//this just creates array of objects
        for(int i=0;i<s.length;i++){
            s[i] = new Student(i);//we have to create objects as well
        }
       for(int i=0;i<s.length;i++){
        double c=s[i].calculateSpi();
        System.out.println("SPI of student "+(i+1)+":" +c);
       }

    }
}