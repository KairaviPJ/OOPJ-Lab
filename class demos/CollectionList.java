import java.util.*;
import java.io.*;
class DStudent{
    int rollNo;
    String name;
   public DStudent(String name,int rollNo){
    this.name = name;
    this.rollNo = rollNo;
   }
}
public class CollectionList{
    public static void main(String[] args) {
        ArrayList<DStudent> students = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("StudentInfo.txt"));
            while(br.ready()){
                String temp = br.readLine();
                String [] splitData = temp.split(",");
                students.add(new DStudent(splitData[1],Integer.parseInt(splitData[0])));
            }
            Iterator<DStudent> itr = students.iterator();
            while(itr.hasNext()){
                DStudent t = itr.next();
                System.out.println(t.name);
            }
            br.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        
    }
}