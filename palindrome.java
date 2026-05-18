import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original number: ");
        int num = sc.nextInt();
        int rev = 0;
        int ori = num;
        while(num > 0){
            int dig = num % 10;
            num = num/10;
            rev = rev*10+dig;
        }
        System.out.println("reversed number: "+rev);
        if(ori == rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
