
// access_modifier return_type function_name(lst of parameters){
// body
//} return type

// Features:-
// 1. Reusability
// 2. Modularity
// 3. Easy to debug

// Example-

import java.util.*;
public class func {
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
