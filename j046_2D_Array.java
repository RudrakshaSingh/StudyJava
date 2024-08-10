//(row,coloumn) col and row index start with 0,0
//first element=(0,0)
//mem consumption=row*cols*datatype size

//DECLARATION
//type[][] arrayName = new type[rows][columns]
//inner loop-col  outer loop-rows

import java.util.Scanner;

public class j046_2D_Array {
     public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int rows = sc.nextInt();
        int cols = sc.nextInt();
   
        int[][] numbers = new int[rows][cols];
   
        for(int i=0; i<rows; i++){
           for (int j = 0; j < cols; j++) {
               numbers[i][j]=sc.nextInt();
           }
        }
   
        //output
        for(int i=0; i<rows; i++){
           for (int j = 0; j < cols; j++) {
               System.out.print(numbers[i][j]+" ");
           }
           System.out.println();
        }
   }
      
}