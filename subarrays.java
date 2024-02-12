import java.util.*;
public class subarrays {
    public static void Subarraysofarrays(int numbers[]) {
        for(int i=0 ; i<numbers.length ;i++){
            for(int j=i+1;j<numbers.length;j++){
                for(int start=i;start<j;start++){
                    System.out.print(numbers[start]+" ");
                }
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for(int i=0 ; i<n ; i++) {
            System.out.print("Enter the " + (i+1) + " element of the array. ");
            numbers[i] = sc.nextInt();
        }
        Subarraysofarrays(numbers);
    }
}
