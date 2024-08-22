//no negative number factorial
//0!=1
//1!=1

import java.util.Scanner;

public class j034FindfactorialOfANumber {
    
    public static void printFactorial(int n) {
        int factorial=1;

        if(n<0){
            System.out.println("inavalid number");
            return;
        }

        for (int i = 1; i <= n; i++) {
            factorial=factorial*i;
        }
        System.out.println("factorial of number is :"+factorial);
        return;//not neccessary to write in void type it returns even without it
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();

        printFactorial(n);

    }
}
//functions vs methods
//similary take input and give output
//methods are called in classes through object
//functions are called directly