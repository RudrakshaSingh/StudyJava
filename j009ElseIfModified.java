//you can if without curly braises if there is only ine statement
import java.util.Scanner;

public class j009ElseIfModified {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();

        if(a==b){
            System.out.println("equal");
        }else if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("a is lesser");
        }
        
    }
}
