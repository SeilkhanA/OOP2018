import java.util.Scanner;

public class StarTriangle {

    private int width;

    private StarTriangle(int width){
        this.width = width;
    }

    /*
    public void drawStar(int width){
        for(int i = 1; i < width; ++i){
            for(int j = 0; j < i+1; ++j){
                System.out.print("[*]");
            }
            System.out.println(" ");

        }
        //System.out.println(" ");
    }
    */
    public String toString(){
        return "[*]";
    }
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();

        StarTriangle small = new StarTriangle(width);
        for(int i = 0; i < width; ++i){
            for(int j = 0; j < i+1; ++j){
                System.out.print(small.toString());
            }
            System.out.println(" ");

        }
        //System.out.println(" ");

        //System.out.println(small.toString(n));
       // small.drawStar(n);
    }
}

