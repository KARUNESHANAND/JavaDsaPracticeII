import java.util.*;
public class findPermutations {
    public static void PermutationsInString(String str , String ans) {
        //base case 
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //recursion - O(n*n!)
        for(int i =0; i< str.length(); i++){
            char curr = str.charAt(i);

            String NewStr = str.substring(0, i) + str.substring(i+1, str.length());
            PermutationsInString(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for which you would like to find the permutations for : ");
        String str = sc.next();
        String ans = "";
        PermutationsInString(str,ans);
    }
}
