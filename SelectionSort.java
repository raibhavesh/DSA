import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize the array
        int arr[] = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the given array
        System.out.println("The given array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sort the array using selection sort
        sortArray(arr);

        // Print the sorted array
        System.out.println("The sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }

    // Method to sort the array using selection sort
    public static void sortArray(int[] arr) {
        int size = arr.length; // Get the size of the array

        for (int i = 0; i < size - 1; i++) {
            // Find the index of the minimum element
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
