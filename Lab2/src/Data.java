import  java.util.Scanner;

public class Data {
    private  double sum = 0;
    private  double max = 0;
    public   int k = 0;


    public  Data(){
    }



    public  void addToData(int n){

        if(max < n){
            max = n;               //find Maximum
        }
        sum = sum + n;           //find middle
        k++;
    }

    public  String result(){
        return  "Average = " + sum/k + "\n" + "Maximum= " + max;
    }

    public  static  void main(String[] args){

        System.out.println("Enter number (Q to quit ):");

        Scanner sc = new Scanner(System.in);

        Data d = new Data();

        int n;

        String s = sc.next();

        while (!s.equals("Q")){         //пока не вводим Q

            n = Integer.parseInt(s);          //convert string into int

            d.addToData(n);                  //and make opearations of finding max and average

            System.out.println("Enter number (Q to quit ):");

            s = sc.next();             //для след ввода числа         //без сканнера будет бесконечно писать "Enter number (Q to quit ):"
        }
        if(s.equals("Q")){                                // иначе, если ввожу Q

            System.out.println(d.result());                 // вывести функцию, дающую ответ
        }
    }

}
