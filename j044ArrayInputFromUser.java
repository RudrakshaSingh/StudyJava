import java.util.Scanner;

public class j044ArrayInputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        //output
        for(int i=0; i < size; i++){
            System.out.println(numbers[i]);
        }
    }
}
