//strings are immutable
//making new string take time for deleting,add 
//stringbuilder solves this problem

//code stored in java in two forms
//stack   or   heap
//String str="h"   h as a string is stored in heap aur stack me variable str banega jo heap me h ki taraf point krega
//str + "e"        "he" will get as new string and h is deleted now pointer will point to he
//it take time to create new thing in heap
//user experience bad

//StringBuilder
//sb in stack and h as string in heap
//ab jaha h stored tha usse hi "he" bna diya nayi string nhi banai

//stringBuilder and string has many similar function

public class j049StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("tony"); //sb naam ki string jiska type stringBuilder hai
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //new function in
        //setCharAt(index, characterToSet)    set character at index given
        sb.setCharAt(0, 'p'); //cannot use it directly in print sout
        System.out.println(sb+" : changed the character");

        //function of stringbuilder
        //insert - eg adding s to tony making it stony
        sb.insert(0, "s");
        System.out.println("Line 35 :"+sb);

        sb.insert(1, "t");
        System.out.println(sb);

        //function of stringbuilder
        //.delete - character or substring
        //sb.delete(startingIndex, endingIndex) endindindex is exclusive dont consider it
        sb.delete(2, 3);
        System.out.println(sb+":string was 'stponny'");

        //function of stringbuilder
        //append-last me jodhna
        sb.append(" hell");
        System.out.println(sb);

        //.length
        System.out.println(sb.length());
    }
}
