import java.util.*; //a package
public class j004takeinput {
    public static void main(String[] args) {
        //input
        System.out.println("Enput input");
        Scanner sc=new Scanner(System.in);//object it has func next//scanner class
        String name=sc.next();//take only one token(one word)
        System.out.println(name);
        sc.close();

        System.out.println("enter input");
        Scanner ddd=new Scanner(System.in);
        String dd=ddd.nextLine();//for full line
        System.out.println(dd);
        ddd.close();
        
        // similarly
        // nextInt()
        // nextfloat()
    }
}