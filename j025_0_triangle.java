//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1
//i+j=2 even then 1
//i+j=odd then 0
public class j025_0_triangle {
    public static void main(String[] args) {
        int n=5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                    
                }
            }
            System.out.println();
        }
    }
}
