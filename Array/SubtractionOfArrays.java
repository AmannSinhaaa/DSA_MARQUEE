package Array;
import java.util.*;
public class SubtractionOfArrays {

    public static int[] calSub(int[] arr1, int[] arr2, int n1, int n2){
        int[] res = new int[Math.max(n1,n2)+1];
        int k = res.length - 1;
        int i = n1 - 1;
        int j = n2 - 1;
        
        while(i >= 0 && j >= 0){
            if(arr1[i] >= arr2[j]){
                res[k] = arr1[i] - arr2[j];
            } else {
                res[k] = (arr1[i] + 10) - arr2[j];
                arr1[i-1]--;
            }
            k--;
            i--;
            j--;
        }

            while(i >= 0){
                res[k--] = arr1[i--];
            }

            int count = 0;
            while(count < res.length - 1 && res[count] == 0){
                count++;
            }
            return Arrays.copyOfRange(res, count, res.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        for(int j = 0; j < arr2.length; j++){
            arr2[j] = sc.nextInt();
        }

        int[] result = calSub(arr1,arr2,n1,n2);
        System.out.println(Arrays.toString(result));

    }
}
