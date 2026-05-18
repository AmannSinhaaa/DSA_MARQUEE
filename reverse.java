import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int res;
        while(num > 0){
            res = num % 10;
            num = num/10;
            rev = rev*10+res;
        }
        System.out.println(rev);
    }
}
