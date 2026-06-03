package Array;
import java.util.*;
public class RemoveDuplicates {

    public static int removeElement(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[j] = nums[i];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int k = sc.nextInt();
        int[] nums = new int[k];
        
        System.out.print("Enter array elements: ");
        for(int i = 0; i < k; i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("After Removing duplicate element: " + removeElement(nums));

    }
}

