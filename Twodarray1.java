//Take a matrix as input from the user.Search for a given number x and print the indices at which it occurs.


import java.util.*;

public class Twodarray1 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] matrix = new int [rows][cols];

        //input
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                matrix[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                if(matrix[i][j]==x){
                    System.out.println("x found at location ("+i+","+j+")");
            }
        }
        }
        



        
    }
    
}
