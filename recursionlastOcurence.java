import java.util.*;
public class recursionlastOcurence {
    public static Integer LastOccu(int[] numbers, int key, int i) {
        if (i == numbers.length) {
            return -1;
        }
        int isFound = LastOccu(numbers, key, i+1);
        if (isFound ==-1 && numbers[i]== key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n ; i++){
            System.out.println("Enter the " + (i+1) + " element of the array.");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the element you would like to find : ");
        int key = sc.nextInt();
        int i = 0;
        int position = LastOccu(numbers,key,i);
        if (position == -1) {
            System.out.println("Number not found.");
        }
        else {
            System.out.println("Number last found at position " + (position+1) + " of the array.");
        }
    }
}
