import java.util.Scanner;

public class j047TakeMatrixFromUserAndSearchXAndPrintItsIndices {
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
        

        int x= sc.nextInt();
        sc.close();

        //traverse
        for(int i=0; i<rows; i++){
           for (int j = 0; j < cols; j++) {
               if(numbers[i][j]==x){
                    System.out.print("number found at loc: ("+i+","+j+")");               
               }
           }
           System.out.println();
        }
   }
}
