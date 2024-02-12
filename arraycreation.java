// package arrays;
import java.util.Arrays;
import java.util.*;
public class arraycreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array to be created");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i= 0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int element : arr1){
            System.out.print(element + " ");
        }
    }
}
