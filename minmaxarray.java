import java.util.*;
import java.util.Scanner;
public class minmaxarray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int fig = sc.nextInt();
        int[] number = new int[fig];

        for(int i=0;i<fig;i++){
            number[i]=sc.nextInt();

        }

        Arrays.sort(number);

        int min = number[0];
        int max = number[fig-1];

        System.out.println("Minimum element is:" + min);
        System.out.println("Minimum element is:" + max);



    }
    
}
