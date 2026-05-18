import java.util.*;
public class switchcase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your role: ");
        String role = sc.next();

        switch(role){
            case "Admin":
            System.out.println("Full access");
            break;

            case "Student":
                System.out.println("Student access");
                break;

            case "Teacher":
                System.out.println("Student and Teacher access");
                break;

            case "Guest":
                System.out.println("Only view");
                break;

            default:
                System.out.println("Invalid role");
        }
    }
}
