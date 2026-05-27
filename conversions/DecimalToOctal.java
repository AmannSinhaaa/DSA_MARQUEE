import java.util.*;
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        int place = 1;
        while(num > 0){
            int res = num % 8;
            result = result+(res*place);
            place = place * 10;
            num = num / 8;
        }
        System.out.println(result);
    }
}
