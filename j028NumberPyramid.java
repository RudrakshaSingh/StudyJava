//    1            4space 1
//   2 2           3space 2 1space 2
//  3 3 3          2space
// 4 4 4 4
//5 5 5 5 5
public class j028NumberPyramid {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
