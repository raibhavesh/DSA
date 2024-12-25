import java.util.Scanner;

public class InsertionSort {
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

        


        System.out.println("the sorted array is: ");
        sortarray(arr);
        for(int i=0;i<size;i++){
            System.out.println(arr[i] + " ");

        }

        sc.close();





    }

    public static void sortarray(int[] arr){
        int size = arr.length;

        for(int i=0; i<=size-1; i++){
            int j= i;
            while( j>0 && arr[j-1]>arr[j]){
                int temp= arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;

            }
            
        }
    }

}
