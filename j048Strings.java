//String
//non primitive datatype - we can take length size on our own
//string are immutable//have to make a new string to change
import java.util.Scanner;

public class j048Strings {
    public static void main(String[] args) {
        //sc is object ,new is  akeyword used to define object
        //scanner non primitive datatype
        Scanner sc = new Scanner(System.in);
        String name1=sc.nextLine();
        System.out.println("your name is "+name1);

        //Functions

        //1.Concatenation-to join two string
        String FirstName = "tony";
        String lastName = "stark";
        String fullName=FirstName+" "+lastName;
        System.out.println(fullName);

        //2.length
        System.out.println(fullName.length());

        //3.charAt-gives the character according to index in a string
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        //4.compareTo 
        //s1>s2 : +ve value  
        //s1=s2 : 0 
        //s1<s2 : -ve value
        //eg in s1:hello s2:wello  s2 is bigger
        String s1="tony";
        String s2="tony";
        //can also we done without compareTo using == but it may fail in some cases
        if (s1.compareTo(s2) ==0) {
            System.out.println("string are equal");
        }else{
            System.out.println("string not equal");
        }

        //give wrong answer because how string in mem
        if (new String("tony") == new String("tony")) {
            System.out.println("string are equal");
        }else{
            System.out.println("string not equal");
        }

        //5.substring(beg index,ending index)-to take substring
        //dont include ending index char
        String sentance = "my name is tony stark";
        String name20=sentance.substring(11,sentance.length());
        String name21=sentance.substring(0);//by default take last index

        //string to integer
        //ParseInt Method of Integer class
        String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);

       //int to string
       //ToString Method of String class
       int number1 = 123;
       String str1 = Integer.toString(number);
       System.out.println(str.length());
 
    }
}
