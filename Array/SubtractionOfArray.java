package Array;
import java.util.*;

public class SubtractionOfArray {

    public static int[] subtract(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int[] res = new int[m];

        int i = n - 1;
        int j = m - 1;
        int k = m - 1;

        int borrow = 0;

        while (k >= 0) {

            int digitA = (i >= 0) ? a[i] : 0;
            int digitB = b[j];

            int diff = digitB + borrow - digitA;

            if (diff < 0) {
                diff += 10;
                borrow = -1;
            } else {
                borrow = 0;
            }

            res[k] = diff;

            i--;
            j--;
            k--;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] ans = subtract(arr1, arr2);

        int idx = 0;
        while (idx < ans.length - 1 && ans[idx] == 0) {
            idx++;
        }

        for (int i = idx; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}