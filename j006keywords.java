//keywords (if,else) (else if) (switch) (break)
//take input age if age>18 adult else not adult

import java.util.Scanner;

public class j006keywords {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.close();

        if(age>18){
            System.out.println("adult");
        }else{
            System.out.println("not adult");
        }
   }
}
