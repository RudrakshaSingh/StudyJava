//arrays-list of items of same datatypes
//syntax
//type[] arrayName=new type[size];
//new is a keyword like break or return. it is used to define to take a new space in memory
//indexing start with 0
//to store in marks array ----- marks[2]=95;
//to see value ---- marks[0];

public class j043ArraysNonPrimitiveDatatypes {
    public static void main(String[] args) {

        // int[] marks = new int[3];  
        int marks[] = new int[3];//can use any format
        //int marks[]={97,48,94}
        

        marks[0] =  97;
        marks[1] =  48;
        marks[2] =  94;
        System.out.println(marks+"  GARBAGE VALUE");//it returns garbage value
        System.out.println(marks[0]+" first element");
        System.out.println(marks[1]+" second element");
        System.out.println(marks[2]+" third element");

        for(int i=0; i < 3; i++){
            System.out.println(marks[i]);
        }
    }    
}
//arrys each space(1byte) has different address in Hexadecimal
//each int type in array take 4 of these space ,eg- 1001 to 1004=for simplification we take add in decimal
//in java it automatically initializes the the array values to null
//if object then null, 
//if int store 0
//if float store 0.0
//if string store empty string
//if boolean store false by default

//property
//length-give size of array ---- marks.length;