import java.util.*;
public class stringPalindrome {
    public static boolean Checkpalindrome(String str){
        for(int i=0 ; i< str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you would like to check if it's a palindrome or not : ");
        String str = sc.nextLine();
        boolean check = Checkpalindrome(str);
        if (check == true ) {
            System.out.println("it is a palindrome.");
        }
        else{
            System.out.println("it is not a palindrome.");
        }

    }
}
