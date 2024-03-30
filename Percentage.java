import java.util.Scanner;
class Percentage{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int marks,i,total=0,n=0;
        float per;
        try{ System.out.println("Enter total marks of each subject: ");
            n = sc.nextInt();
        for(i=1;i<=5;i++)
        {
            System.out.println("Enter marks of subject "+i+""  );
            marks = sc.nextInt();
            while(marks>n){System.out.println("Enter valid marks");
                                   marks=sc.nextInt(); 
                }
            total=total+marks;
        }
        
        per =(100*total)/(float)(5*n);
        if(per>=60){System.out.println("First division");}
        else if(per>50 && per<59){System.out.println("Second division");}
        else if(per>40 && per<49){System.out.println("Third division");}
        else if(per<40){System.out.println("Fail");}
    }
    finally{sc.close();}
    }
}