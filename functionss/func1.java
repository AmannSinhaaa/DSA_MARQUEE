import java.util.*;
public class func1 {
    public static boolean checkAge(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        boolean isAdult = checkAge();
        System.out.println(isAdult);
    }
}
