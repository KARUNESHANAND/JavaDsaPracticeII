import java.util.*;
public class largestinarray {
    public static int LargestInArray(int arr[]){
        int large = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>large) {
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            System.out.println("Enter the " + (i+1) + " element of the array");
            arr[i] = sc.nextInt();
        }
        int largest = LargestInArray(arr);
        System.out.println("The largest element in the array is " + largest);

    }  
}
