import java.util.Scanner;

public class j010SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("hi");
                break;
            case 2: System.out.println("hello");
            break;
            default: System.out.println("invalid");
                
        }
    }
}
