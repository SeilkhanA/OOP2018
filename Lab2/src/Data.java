import java.util.Scanner;

public class Data {

    private int input;
    private double average;
    private double max;

    public Data(){

    }
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the scores:");
            double input = 0;
            double num = 0;
            double sum = 0;

            while (input != '')
            {
                input = scan.nextDouble();
                if (input != 'Q') {
                    sum += input;
                    num++;
                }
            }
            System.out.println("Average = " + (sum/num));
        }

}
