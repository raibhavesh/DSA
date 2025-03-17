import java.util.Scanner;
public class MergeSort {
    public static void conquer(int arr[], int mid, int si, int ei){
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        int merged[] = new int[ei-si+1];
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<arr[idx2]){
                merged[x]=arr[idx1];
                x++;idx1++;
            }
            else{
                merged[x]=arr[idx2];
                x++;idx2++;
            }
        }
        while(idx1<=mid){
            merged[x]=arr[idx1];
            x++;idx1++;
        }
        while(idx2<=ei){
            merged[x]=arr[idx2];
            x++;idx2++;

        }
        for(int i=0,j=si;i<merged.length;i++,j++){

            arr[j]=merged[i];
        }
    }
    public static void divide(int arr[], int si, int ei ){
        if(si==ei){
            return;
        }
        int mid = (si+ei)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The given array is: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        divide(arr, 0, size-1);
        for(int i=0;i<size;i++){
            System.out.println(arr[i] + " ");
    }
    }
    

}
