import java.util.Scanner;

public class j033MakeAFuntionToMultiply2NumberAndReturnTheirProduct {
    public static int calculateProduct(int a,int b) {
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        sc.close();

        System.out.println("product of 2 number is :"+calculateProduct(a, b));

    }
}
