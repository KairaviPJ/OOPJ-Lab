class Time{
    int hours;
    int minutes;
    int seconds;
    public Time(){
        hours=0;
        minutes=0;
        seconds=0;
    }
    public Time(int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    public void print(){
        System.out.println("Hour="+hours+",Minutes="+minutes+"seconds="+seconds);
    }
    public Time subtract(Time temp){
        Time ans = new Time();
        ans.hours = this.hours-temp.hours;//"this" refers to the method of the variable which calls the method
        ans.minutes = this.minutes-temp.minutes;//"this" keyword is used to access the data of the variable through which the method subtract is called
        ans.seconds = this.seconds - temp.seconds;
        if(ans.seconds<0){
            ans.seconds+=60;
            ans.minutes--;
        }
        

        return ans;
    }
}
public class TimeDemo{
    public static void main(String[] args) {
        Time t1 = new Time(13,41,10);
        t1.print();
        Time t2 = new Time(12,00,20);
        Time ans1 = t1.subtract(t2);
        ans1.print();
        
    }
   
}