public class CalcPower {
    public static int power(int  x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int pownm1= power(x,n-1);
        int pown = x*pownm1;
        return pown;

    }

    public static void main(String args[]){
        int x=2;
        int n=6;
        int ans = power(x,n);
        System.out.println(ans);

    }
}
