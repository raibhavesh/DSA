package Recursions;

public class Factorial {
    public static int printFact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_nm1 = printFact(n-1);
        int fact = n*fact_nm1;
        return fact;
    }
    public static void main(String args[]){
        int n = 5;
        int ans = printFact(n);
        System.out.println();
        System.out.println(ans);    
    }
    
}
