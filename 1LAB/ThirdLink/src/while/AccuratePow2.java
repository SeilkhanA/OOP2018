import java.util.Scanner;

public class AccuratePow2 {
    public static void main (String[] args){

        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        int k = 0;

        while(n){
            System.out.print(i + " ");
            i = i * 2;
        }
    }
}



#include <iostream>
#include <cmath>
using namespace std;
        int main ()
        {
        int n;
        cin >> n;
        int k = 0;
        while (n)
        {
        k += n % 2;
        n /= 2;
        }
        if (k == 1)
        cout<<"YES";
        else
        cout<<"NO";
        return 0;
        }