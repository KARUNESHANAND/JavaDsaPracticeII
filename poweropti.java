import java.util.*;
public class poweropti {
    public static Integer powerOpti(int n , int p) {
        if (p==0) {
            return 1;
        }
        int halfPower = powerOpti(n, p/2);
        int halfPowerSq = halfPower * halfPower;
        //for p is odd 
        if (p%2 != 0) {
            halfPowerSq = n * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you would like to find the power for : ");
        int n = sc.nextInt();
        System.out.println("Enter the power you would like to calculate : ");
        int p = sc.nextInt();
        System.out.println("The output is : " + powerOpti(n,p));
    }
}
