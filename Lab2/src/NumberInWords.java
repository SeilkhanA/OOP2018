import java.util.Scanner;

public class NumberInWords{
    /*
    String [] thousands = {" ", "thousand"};
    String [] tens = {" ", "ten", "twenty", "thirty",
            "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String [] less20 = {" ", "one", "two", "three",
            "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen","fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"};
    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";

    }

*/
    public String inWordstillHundred(int n){

        String s = " ";
        while(n != 0){
            if(n == 1){
                s = s + "one ";
                n = 0;
            }
            else if (n == 2){
                s = s + "two ";
                n = 0;
            }
            else if (n == 3){
                s = s + "three ";
                n = 0;
            }
            else if (n == 4){
                s = s + "four ";
                n = 0;
            }
            else if (n == 5){
                s = s + "five ";
                n = 0;
            }
            else if (n == 6){
                s = s + "six ";
                n = 0;
            }
            else if (n == 7){
                s = s + "seven ";
                n = 0;
            }
            else if (n == 8){
                s = s + "eight ";
                n = 0;
            }
            else if (n == 9){
                s = s + "nine ";
                n = 0;
            }
            else if (n == 10){
                s = s + "ten ";
                n = 0;
            }
            else if (n == 11){
                s = s + "eleven ";
                n = 0;
            }
            else if (n == 12){
                s = s + "twelve ";
                n = 0;
            }
            else if (n == 13){
                s = s + "thirteen ";
                n = 0;
            }
            else if (n == 14){
                s = s + "fourteen ";
                n = 0;
            }
            else if (n == 15){
                s = s + "fifteen ";
                n = 0;
            }
            else if (n == 16){
                s = s + "sixteen ";
                n = 0;
            }
            else if (n == 17){
                s = s + "seventeen ";
                n = 0;
            }
            else if (n == 18){
                s = s + "eighteen ";
                n = 0;
            }
            else if (n == 19){
                s = s + "nineteen ";
                n = 0;
            }
            else if (n >= 20 && n < 30){
                s = s + "twenty ";
                n = n - 20;
            }
            else if (n >= 30 && n < 40){
                s = s + "thirty ";
                n = n - 30;
            }
            else if (n >= 40 && n < 50){
                s = s + "forty ";
                n = n - 40;
            }
            else if (n >= 50 && n < 60){
                s = s + "fifty ";
                n = n - 50;
            }
            else if (n >= 60 && n < 70){
                s = s + "sixty ";
                n = n - 60;
            }
            else if (n >= 70 && n < 80){
                s = s + "seventy ";
                n = n - 70;
            }
            else if (n >= 80 && n < 90){
                s = s + "eighty ";
                n = n - 80;
            }
            else if (n >= 90 && n < 100){
                s = s + "ninty ";
                n = n - 90;
            }
        }
        return s;
    }

    public String convert(int n){
        String s = " ";
        while(n != 0){
            if(n >= 1 && n < 100){
                s = s +  inWordstillHundred(n);
                n = 0;
            }
            else if (n >= 100 && n < 1000){
                s = s + inWordstillHundred(n/100);
                s = s + "hundred and";
                n = n % 100;
            }

            else if(n >= 1000 &&  n < 10000){
                s = s + inWordstillHundred(n/1000);
                s = s + "thousand";
                n = n % 1000;
            }
            else if(n >= 10000 &&  n < 100000){
                s = s + inWordstillHundred(n/1000);
                s = s + "thousand";
                n = n % 1000;
            }
        }
        return s;
    }

    public static void main(String [] args){

        NumberInWords niw = new NumberInWords();

        Scanner sc = new Scanner(System.in);
        String s;

        int n = sc.nextInt();
        s = niw.convert(n);
        System.out.print(s);
    }
}