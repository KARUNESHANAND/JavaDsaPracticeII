import java.util.*;

public class recursionsumofnnaturalnumb {
    public static int SumIntNaturalNumb(int n) {
        if(n==1){
            return 1;
        }
        int fnadd = n + SumIntNaturalNumb(n-1);
        return fnadd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you would like to print the sum : ");
            int n = sc.nextInt();
            System.out.println(SumIntNaturalNumb(n));
    }    
}
