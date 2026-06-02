package Array;
import java.util.*;
public class reverseArray {
    public void reverse(int arr[]) {
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
                left++;
                right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray ra = new reverseArray();
        ra.reverse(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}