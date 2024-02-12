import java.util.*;
public class recursionfibonacci {
    public static int Fibona(int n){
        if(n == 1 || n==0) {
            return n;
        }
        int fibn_1 = Fibona(n-1);
        int fibn_2 = Fibona(n-2);
        return fibn_1 + fibn_2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you would like to calculate the fibonacci series : ");
        int n = sc.nextInt();
        int result = Fibona(n);
        System.out.println("The " + n + " th fibonacci number is : " + result);
  }  
}
