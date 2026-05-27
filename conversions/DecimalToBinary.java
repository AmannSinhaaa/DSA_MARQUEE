import java.util.*;
public class DecimalToBinary {
    public static int decimalToBinary(int num) {
        int result = 0;
        int place = 1;
        while (num > 0) {
            int rem = num % 2;
            result = result + (rem * place);
            place = place * 10;
            num = num / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = decimalToBinary(num);
        System.out.println(ans); 
    }
}