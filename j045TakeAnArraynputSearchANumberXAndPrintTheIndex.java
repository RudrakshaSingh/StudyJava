import java.util.Scanner;

public class j045TakeAnArraynputSearchANumberXAndPrintTheIndex {
    public static void main(String[] args) {
       Scanner sc = new Scanner((System.in));
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        sc.close();

        //output //linear serach
        for(int i=0; i < numbers.length; i++){
            if (x==numbers[i]) {
                System.out.println("x found at index :"+i);
            }
        }
    }
}
