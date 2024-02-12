import java.util.*;
public class bubblesort {
    public static void bubbleSort(int numbers[]) {
        for(int i=0; i<=numbers.length-2 ; i++){
            for(int j=0; j<=numbers.length-2-i; j++){
                if(numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
            System.out.print("Array after turn " + i + " : "  );
            for(int k =0 ; k<numbers.length; k++){
                System.out.print(numbers[k] + " ");
            }
            System.out.println();
        }
        System.out.print("The sorted array is : ");
        for(int k =0 ; k<numbers.length; k++){
            System.out.print(numbers[k] + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0 ; i<n ; i++) {
            System.out.println("Enter the " + (i+1)+" element of the array.");
            numbers[i] = sc.nextInt();
        }
        bubbleSort(numbers);
    }
}
