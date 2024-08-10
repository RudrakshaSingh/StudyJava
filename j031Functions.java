// return type function name(type arg1,type arg2 ...){
// operations
// }
//void   type-no return
//return- jaha se bhi function ke andar aye the ab bhaar chale jaye

import java.util.Scanner;

public class j031Functions {
    
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.next();

        printMyName((name));//call the function
    }
}
//storing one thing in stack is called stack frame
//name fun then go to stack take variable and gets removed after execution from memory stack