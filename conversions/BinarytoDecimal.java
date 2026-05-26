import java.util.*;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int place = 1;
        while(n > 0){
            int pow = n % 10;
            result = result + (place * pow);
            place *= 2;
            n = n / 10;
        }
        System.out.println(result);
    }
}
