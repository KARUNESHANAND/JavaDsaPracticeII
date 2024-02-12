import java.util.*;
public class backtrackingarray {
    public static void Subarray(int[] numbers , int startArr , int numbStart){
        if (startArr== numbers.length) {
            PrintArr(numbers);
            return;
        }
        numbers[startArr] = numbStart;
        Subarray(numbers, startArr+1, numbStart+1);
        numbers[startArr] = numbStart -2;
    }
    public static void PrintArr(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int n = sc.nextInt();
      int[] numbers = new int[n];
      Subarray(numbers , 0, 1);  
      PrintArr(numbers);
    }
}
