import java.util.*;
public class euclidianalgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int max = sc.nextInt(); //divident
            int min = sc.nextInt(); // divisor

            while(min != 0){
                int rem = max%min;
                max = min;
                min = rem;
            }

            System.out.println(max);
        
    }
}
