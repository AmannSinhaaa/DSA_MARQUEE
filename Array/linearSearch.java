package Array;
import java.util.*;
public class linearSearch {

    static boolean is_linear(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
            return false;
    }

    static int linear_search(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target to search: ");
        int target = sc.nextInt();

        System.out.println(linear_search(arr, target));
        System.out.println(is_linear(arr, target));
       
    }
}
