//   * - 3(n-1) space 1 star
//  ** - 2(n-2) space 2 star
// *** - 1(n-3) space 3 star
//**** - 0(n-4) space 4 star
public class j021HalfPyramid180 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
