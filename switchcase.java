import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();

        System.out.println("Enter operation:");
        char op = sc.next().charAt(0);
        float result;
        switch(op){

            case '+':
                System.out.println(a+b);
                result = a + b;
                break;

            case '-':
                System.out.println(a-b);
                result = a - b;
                break;
            
            case '*':
                System.out.println(a*b);
                result = a * b;
                break;

            case '/':
                if(b != 0){
                System.out.println(a/b);
                } else {
                    System.out.println("Can't divide by zero");
                }
                result = a / b;
                break;

            case '%':
                if(b != 0){
                System.out.println(a%b);
                } else {
                    System.out.println("Can't divide by zero");
                }
                result = a % b;
                break;

                default:
                    System.out.println("Invalid option");

        }
    }
}
