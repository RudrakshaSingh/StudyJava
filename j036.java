//Write a function that takes in the radius as input and returns the circumference of a circle.

    import java.util.*;


    public class j036 {
       public static Double getCircumference(Double radius) {
           return 2 * 3.14 * radius;
       }
       public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          Double r = sc.nextDouble();
          sc.close();
          System.out.println(getCircumference(r));
       }   
    }
    
