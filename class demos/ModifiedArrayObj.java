import java.util.Scanner;
class Studentt{
   int rollNo;
    int present;

    public Studentt(int rollNo,int present){
        this.rollNo=rollNo;
        present=0;
    }
}
public class ModifiedArrayObj {
    public static void main(String[]args){
        Studentt [] stu = new Studentt[1000];//stack memoery so won't be wasted
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<stu.length;i++){
            System.out.println("Roll "+(i+101));
            int temp =sc.nextInt();
            if(temp==-1){
                int nextRollNo=((((i+101)/100)+1)*100);
                i = nextRollNo-101;
                continue;
            }
            else if(temp==-2){
                break;
            }
            stu[i] = new Studentt(i+101,temp);
       }
       for(int i=0;i<stu.length;i++){
        if(stu[i]!=null && stu[i].present==1){
            System.out.println(stu[i].rollNo+",");
        }
       }
       System.out.println("Is attendance okay?Enter 1 for okay");
       int ok = sc.nextInt();
       if(ok!=1){
            while(true)//loop continues till a positive number is entered
            System.out.println("Enter roll no to edit: ");
        
            if(){
                for(int i=0;i<stu.length;i++){
                    
                }
            }

                // System.out.println("Enter 1 for present and 0 for absent: ");
                // stu[i].rollNo= sc.nextInt();
            }
        }
       
       
       
    }
    

