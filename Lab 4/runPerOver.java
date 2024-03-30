import java.util.Scanner;
public class runPerOver{
	public static void main(String[]args){
		int a[][][] = new int[2][2][6];
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter runs in first inning: ");
        System.out.println("(Enter 50 for wicket and 51 for wide ball)");
        int i=0,j=0,k=0,sum1=0,sum2=0;
        //a[0][0][0]= 0;
        for(i=0;i<2;i++){
            for(j=0;j<6;j++){
                System.out.print("Enter no. of runs in over"+" "+(i+1)+" and ball"+" "+(j+1)+" :" );
                a[k][i][j] = sc.nextInt();
                
                if(a[k][i][j]==50){
                    sum1+=0;
                }
                else if(a[k][i][j]==51){
                    sum1+=1;
                }
                else{sum1+=a[k][i][j];}
                
            }
        }
        
        System.out.print("Enter runs in second inning: ");
        k=1;
        for(i=0;i<2;i++){
            for(j=0;j<6;j++){
                System.out.print("Enter no. of runs in over"+" "+(i+1)+" and ball"+" "+(j+1)+" :" );
                a[k][i][j] = sc.nextInt();
                 if(a[k][i][j]==50){
                    sum2+=0;
                }
                else if(a[k][i][j]==51){
                    sum2+=1;
                }
                else{sum2+=a[k][i][j];}
                
            }
        }
        System.out.print("Sum of runs in inning 1: "+sum1);
        System.out.print("\nSum of runs in inning 2: "+sum2);
	}
}