import java.util.*;
public class maxmsubarray {
    public static void MaximumSubArray(int numbers[]){
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++) {
            int start = i;
            for(int j=i; j<numbers.length;j++){
                int end = j;
                currentSum =0;
                for(int k = start; k<=end; k++){
                    currentSum  += numbers[k];
                }
                System.out.println(currentSum);
                if (currentSum>maximumSum) {
                    maximumSum = currentSum;
                }
            }
        }
        System.out.println("The maximum sum of subarray is : " + maximumSum );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i= 0 ; i<n ; i++) {
            System.out.println("Enter the " + (i+1) + " element of the array.");
            numbers[i] = sc.nextInt();
        }
        MaximumSubArray(numbers);
    }
}
