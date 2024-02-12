import java.util.*;
public class firstOccurence {

    public static Integer firstOccu(int[] numbers , int key , int i){
        if (i == numbers.length) {
            return -1;
        }
        if (numbers[i]== key) {
            return i;
        }
        return firstOccu(numbers, key, i+1);
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
        int position = firstOccu(numbers,key,i);
        if (position == -1) {
            System.out.println("Number not found.");
        }
        else {
            System.out.println("Number found at position " + (position+1) + " of the array.");
        }

    }
}