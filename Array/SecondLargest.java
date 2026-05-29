package Array;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int second_largest = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > second_largest && largest != arr[i]){
                second_largest = arr[i];
            }
        }
        System.out.print(second_largest);
    }
}
