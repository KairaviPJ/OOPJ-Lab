import java.util.*;
import java.io.*;
class Point{
  int x;
  int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

     static public double addPoints(Point p1,Point p2){
        double ans=0;
        ans=Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y,2));
        return ans;
    }
}
public class CollectionPoint {
    public static void main(String[] args) {
        ArrayList<Point> p = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("Point.txt"));

            // String firstData = br.readLine();
            // String [] split = firstData.split(",");
            // Point p1 = new Point(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
           
            while(br.ready()){
                String temp = br.readLine();
                String [] splitData = temp.split(",");
                p.add(new Point(Integer.parseInt(splitData[0]),Integer.parseInt(splitData[1])));
            }
            // System.out.println(p.size());
            double answer =0;
            for(int i=0;i<p.size()-1;i++){
                answer+= Point.addPoints(p.get(i),p.get(i+1));
            }
            System.out.println(answer);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
