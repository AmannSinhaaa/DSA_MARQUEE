package Array;
import java.util.*;
public class GPTriplet {
    
    static void triplets(int[] arr, int n){
        System.out.print("Geometric triplets for the following: ");
        for(int j = 1; j < n-1; j++){
            int i = j - 1;
            while(i >= 0){
                int k = j + 1;
                while(k < n){
                    if(arr[j] * arr[j] == arr[i] * arr[k]){
                        System.out.print("(" + arr[i] + " " + arr[j] + " " + arr[k] + " ) ");
                    }
                    k++;
                }
                i--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {1,2,6,10,18,54};
        int n = arr.length;
        triplets(arr,n);
    }
}
