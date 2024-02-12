import java.util.*;
// pacakage.arrays;
public class passingarraysasarg {
    public static void update(int arr[]) {
        for(int i =0 ; i<arr.length; i++) {
            arr[i] = arr [i] + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            System.out.println("Enter the " + (i+1) + " element of the array.");
            arr[i] = sc.nextInt();
        }
        update(arr);
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
