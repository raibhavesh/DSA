import java.util.*;
public class reversing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fig = sc.nextInt();
        int[] number=new int[fig];
        

        for(int i=0;i<fig;i++){
            number[i]=sc.nextInt();
        }

        for(int i=fig-1 ; i>=0; i--)
        {
            System.out.println(number[i]);
        }
}
}