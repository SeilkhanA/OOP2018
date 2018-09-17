import java.util.Scanner;

public class Repeat{
    public static class Repeated {
        public static int [] repeat (int x[]){
            int y [] = new int [x.length*2];          //new array where all numbers will be doubled, that's why length * 2
            for(int i = 0; i < y.length; ++i){        //run for elements of doubled array
                y[i] = x[i/2];
            }
            return y;
        }
    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        //int a [] = {1,2,3,4,5};
        int b = sc.nextInt();

        int a[] = new int [b];
        for(int i = 0; i < b; ++i){
                a[i] = sc.nextInt();
        }

        int y [] = Repeated.repeat(a);
        for(int i = 0; i <y.length; ++i){
            System.out.print(y[i] + " ");
        }
    }
}
