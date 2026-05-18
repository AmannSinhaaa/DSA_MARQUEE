import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int fact = 1;
        while(num > 0){
            fact *= num;
            fact--;
        }
        System.out.println(fact);
    }
}
