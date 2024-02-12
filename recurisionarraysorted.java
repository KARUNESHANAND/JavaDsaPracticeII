import java.util.*;

public class recurisionarraysorted {
    public static boolean CheckSort(int arr1[] , int key ){
        if (key == arr1.length - 1){
            return true;
        }
        if (arr1[key] > arr1[key + 1]) {
            return false;
        }
        return CheckSort(arr1, key + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array you would like to make the array for : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i< n ; i++) {
            System.out.println("Enter the " + (i+1) + " element of the array.");
            arr1[i] = sc.nextInt();
        }
        int key = 0;
        if (CheckSort(arr1, key)==true) {
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array is not sorted.");
        }
    }    
}
