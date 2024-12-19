import java.util.*;
import java.util.Scanner;
public class findGCD{

    public static int GCDandHCF(int a, int b){
        while(b!=0){
        int temp =b;
        b = a%b;
        a= temp;

        }
        return a;

    }
 
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first no.");
        int num1 = sc.nextInt();

        System.out.println("Enter second no. ");
        int num2 = sc.nextInt();

        int Gcd=  GCDandHCF(num1, num2);

        System.out.println("Hence the GCD of the given two number is " + Gcd);
        sc.close();
    }

    
}

