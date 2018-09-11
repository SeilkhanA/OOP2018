import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
public void Universal(int h, int m, int s){
    hour = ((h >= 0 && h < 24 ) ? h : 0);
    minute = ((m >= 0 && m < 60 ) ? m : 0);
    second = ((s >= 0 && s < 60 ) ? s : 0);
}

public void Standard(int h, int m, int s){
    hour = ((h >= 0 && h <= 12) ? h : 0);
    hour = ((h >= 0 && h == 13) ? h = 1 : h);
    hour = ((h >= 0 && h == 14) ? h = 2 : h);
    hour = ((h >= 0 && h == 15) ? h = 3 : h);
    hour = ((h >= 0 && h == 16) ? h = 4 : h);
    hour = ((h >= 0 && h == 17) ? h = 5 : h);
    hour = ((h >= 0 && h == 18) ? h = 6 : h);
    hour = ((h >= 0 && h == 19) ? h = 7 : h);
    hour = ((h >= 0 && h == 20) ? h = 8 : h);
    hour = ((h >= 0 && h == 21) ? h = 9 : h);
    hour = ((h >= 0 && h == 22) ? h = 10 : h);
    hour = ((h >= 0 && h == 23) ? h = 11 : h);
    hour = ((h >= 0 && h == 24) ? h = 12 : h);
    minute = ((m >= 0 && m < 60) ? m : 0);
    second = ((s >= 0 && s < 60) ? s : 0);
}
    public String toFormat(){
    return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();



        Time time = new Time(h,m,s);

        time.Universal(h,m,s);
        System.out.println(time.toFormat());

        time.Standard(h,m,s);
        System.out.print(time.toFormat() + " ");

        if(h == 12){
            System.out.println("PM");
        }
        if(h < 12){
            System.out.println("AM");
        }
        if(h == 13 || h == 14 || h == 15 || h == 16 ||
                h == 17 || h == 18 || h == 19 || h == 20 ||
                h == 21 || h == 22 || h == 23){
            System.out.println("PM");
        }else
        if(h == 24){
            System.out.println("AM");
        }
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        //Time time2 = new Time(h1,m1,s1);

        // String time1="";
        // String time2="0:01:35";
        //time2.Universal(h1,m1,s1);
        System.out.println(Integer.parseInt(time.toFormat()) + 2);


    }
}
