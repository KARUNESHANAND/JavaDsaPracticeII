import java.util.*;
public class tilingrecursion {
    public static Integer TilingWays(int n) {
        if (n==0 || n ==1) {
            return 1;
        }
        int fm1 = TilingWays(n-1);
        int fm2 = TilingWays(n-2);
        return fm1 + fm2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ways = TilingWays(n);
        System.out.println("The total number of ways are : " + ways);
    }
}
