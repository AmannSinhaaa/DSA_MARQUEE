package Array;
import java.util.*;
public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elemets: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int maxDistance = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    maxDistance = Math.max(maxDistance, j - i);
                    break;
                }
            }
        }
        System.out.print("Maximum distance between two elements is: " + maxDistance);
    }
}
