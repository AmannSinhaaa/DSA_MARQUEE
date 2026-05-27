package Array;
import java.util.*;
public class FindElement {
    static int find_element(int[] arr, int i){
        for(int index = 0; index < arr.length; index++){
            return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index to return: ");
        int index = sc.nextInt();
        System.out.println(find_element(arr,index));
    }
}
