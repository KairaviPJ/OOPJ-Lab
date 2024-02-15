import java.util.Scanner;
public class Interpolation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //taking inputs
        float x[],y[];
        int i,j,n;
        float ans=0;
        System.out.print("Enter the size of data: ");
        n = sc.nextInt();
        x= new float[n];
        y = new float[n];
        for(i=0;i<n;i++){
            System.out.print("Enter x["+i+"]: ");
            x[i] = sc.nextFloat();
            System.out.print("Enter y["+i+"]: ");
            y[i]=sc.nextFloat();
        }
        int startindex=0;
        float number;
        System.out.print("Enter argument at which value is to be found: ");
        number = sc.nextFloat();
        for(i=0;i<n-1;i++){
            if(number>x[i] && number<x[i+1]){
                startindex = i;
                break;
            }
            else{
                startindex=0;
            }
        }
        float p = (number-x[startindex])/(x[1]-x[0]);
        float prodterm = 1;
        // float diff[][] = new float[n-1][];
        // diff[n-1][0] = 0;
        
        // System.out.println(startindex);
        //Calculation of forward diff table //y0+p*del(y0)/1!+p*p-1*del^2y0/2!
        for(i=startindex+1;i<=n-1;i++){
            for(j=1;j<=i;j++){
               prodterm=1;
               int k=j;
               int m=0;
               int fact = 1;
               
               while(k>0){
                    fact = fact*k;
                    k--;
                }
                // for(m=0;m<n-i;m++){
                //     diff[i][m] = y[i+1]-y[i];
                    
                // }
                prodterm=(((prodterm*p)))/fact;
               p--;
               ans+= prodterm+y[startindex];
            }
            
        }
        System.out.println(ans);
    }
}
