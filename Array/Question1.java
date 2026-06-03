package Array;
import java.util.*;
public class Question1 {
    
    public  static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if((nums[i] + nums[j]) == target ){
                    return new int[]{i,j};
                }
            }
        }
            return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        int [] ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
        }
}
