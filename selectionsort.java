import java.util.*;
public class selectionsort {
    public static void selectionSort(int numbers[]) {
        for(int i=0 ; i<numbers.length-2;i++){
            int minPos =i;
            for(int j = i+1; j<=numbers.length-1;j++){
                if (numbers[minPos]>numbers[j]) {
                    minPos = j;   
                }
            }
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println("The sorted array is : ");
        for(int k=0; k<numbers.length;k++){
            System.out.print(numbers[k] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i<n ; i++){
            System.out.println("Enter the " + (i+1) + " element of the array.");
            numbers[i] = sc.nextInt();
        }
        selectionSort(numbers);
    }
}
