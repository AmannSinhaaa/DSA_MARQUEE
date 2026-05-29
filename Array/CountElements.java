package Array;
import java.util.*;
public class CountElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        int count = 0;
        for(int i = 0; i < x; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < x){
                count++;
            }
        }
        System.out.println(count);
    }
}
