/**
 * binarysearch
 */
import java.util.*;
public class binarysearch {
    public static int BinarySearchh(int arr[], int key) {
        int start = 0;
        int end = arr.length;
        System.out.println(end);
        int mid = (int)(start + end)/2;
        while(start<=end) {
            if(arr[mid]==key){
                return mid;
            }
            else {
                if (arr[mid]<key) {
                    for(int i= mid+1; i<=end; i++){
                        if (arr[i]==key) {
                            return i+1;
                        }

                    }
                }
                else if (arr[mid]>key) {
                    for(int i = 0; i<mid;i++){
                        if (arr[i]==key) {
                            return i+1;
                        }
                    }
                }
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7,8,9,12,13,14,15,16};
        int key = 20;
        int location = BinarySearchh(numbers, key);
        System.out.println("The location of the key is : " + location);
    }
}