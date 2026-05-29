package Array;
import java.util.*;

public class DistanceBetweenTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int res = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] % 2 == 0) {
                        if (res == -1) {
                            res = j - i;
                        } else {
                            res = Math.min(res, j - i);
                        }
                        break;
                    }
                }
            }
        }
        System.out.println("Minimum distance between two even numbers: " + res);
    }
}