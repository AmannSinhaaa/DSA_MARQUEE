import java.util.*;
public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int place = 1;
        while(num > 0){
            int res = num % 10;
            result = result + (place*res);
            place *= 8;
            num /= 10;
        }
        System.out.println(result);
    }
}
