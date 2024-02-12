import java.util.Scanner;

public class lexicographicstrin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] stringArray = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " string of the array: ");
            stringArray[i] = sc.nextLine();
        }

        System.out.println("String array elements:");

        for (int j = 0; j < n; j++) {
            System.out.print(stringArray[j] + " ");
        } 
    }
}
