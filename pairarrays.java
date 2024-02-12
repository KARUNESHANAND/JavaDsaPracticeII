import java.util.*;
public class pairarrays {
    public static void pairingArrays(int numbers[]) {
        for(int i=0; i<numbers.length;i++) {
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr + "," + numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for(int i = 0; i<n ; i++){
            System.out.println("Enter the " + (i+1) + " element of the array");
            numbers[i] = sc.nextInt();
        }
        pairingArrays(numbers);
    }
}
