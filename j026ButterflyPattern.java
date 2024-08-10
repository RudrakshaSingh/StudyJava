//*      * 1star 6space 1star
//**    ** 2star 4space 2star
//***  *** 3star 2space 3star
//******** 4star 0space 4star
//********  REPEAT
//***  ***
//**    **
//*      *

public class j026ButterflyPattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n-i)*2; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n-i)*2; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
