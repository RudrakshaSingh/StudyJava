//Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
//This Java program calculates the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm
import java.util.*;

public class j040 {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       sc.close();

       // Loop until n1 equals n2
       while(n1 != n2) { 
           // If n1 is greater than n2, subtract n2 from n1
           if(n1 > n2) {
               n1 = n1 - n2;
           } else { // If n2 is greater than n1, subtract n1 from n2
               n2 = n2 - n1;
           }
       }
       // When n1 equals n2, it means n1 (or n2) is the GCD of the original n1 and n2
       System.out.println("GCD is : "+ n2);
   }   
}
