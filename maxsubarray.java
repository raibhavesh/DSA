//Given an integer array nums, find the subarray with the largest sum, and return its sum.

import java.util.*;
public class maxsubarray {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] number = new int[n];

    for(int i=0;i<n;i++){
        number[i]=sc.nextInt();
    }

    

    int maxsum=0;
    int currsum=0;

    for(int i=0;i<n;i++){
        currsum= currsum + number[i];
        if(currsum>maxsum){
            maxsum=currsum;

        }
        if(currsum<0){
            currsum=0;
        }

        

    }
    System.out.println("Maximum Subarray Sum is: " + maxsum);





}
}
