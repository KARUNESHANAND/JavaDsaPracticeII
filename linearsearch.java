// package.arrays;
import java.util.*;
public class linearsearch {
    public static int LinearSearch(int[] arr, int key) {
        int position =0;
        for(int i = 0 ; i < arr.length; i++ ){
            if (arr[i] == key ) {
                position = i;
            }
            else {
                position = -1;
            }
        }
        return position;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i< n ; i++) {
            System.out.println("Input the " + (i+1) + " element of the array.");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you would like to find in the array : ");
        int key = sc.nextInt();
        int location  = LinearSearch(arr, key);
        System.out.println("The location of the integer in the array is : " + location);
    }
    
}
