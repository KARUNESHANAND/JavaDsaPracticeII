
import java.util.*;
public class string1 {
    public static void SeparateString(String str) {
        for(int i = 0; i<str.length();i++){
            System.out.print(" " + str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String str = sc.nextLine();
        SeparateString(str);
    }
}
