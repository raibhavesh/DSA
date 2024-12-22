import java.util.*;
import java.util.Scanner;
public class SumofDivisor {
    public static long Divisorsum(int n){

  
        long sum=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum;


    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        long totalSum = 0;

        
        for (int i = 1; i <= n; i++) {
            totalSum += Divisorsum(i);
        }

        System.out.println("Sum of all divisors from 1 to " + n + " is: " + totalSum);
    }

}



