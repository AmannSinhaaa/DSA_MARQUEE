import java.util.*;
public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        String eli = (age >= 18) ? "Eligible" : "Not eligible";
        System.out.println(eli);
    }
}
