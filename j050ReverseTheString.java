import java.util.*;;
public class j050ReverseTheString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
//time complexity is O(n/2) as 2 is comstant O(n) is time complexity
