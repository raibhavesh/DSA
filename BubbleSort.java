import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: " );
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0 ; i<size; i++){
            arr[i]= sc.nextInt();

        }

        System.out.println("The given array is: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i] + " ");

        }

        System.out.println();

        sortedarray(arr);
        for(int i=0;i<size;i++){
            System.out.println(arr[i] + " ");
        }
        sc.close();



    }
    
    public static void sortedarray(int[] arr){
        int size= arr.length;

    for(int i=size-1;i<=0;i--){
        for(int j =0; j<=i-1; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    } 
}
