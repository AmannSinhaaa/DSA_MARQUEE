import java.util.*;
public class nCr {
    
        static int fac(int f){
        int fact = 1;
        for(int i = 1; i <= f; i++){
            fact *= i;
        }
        return fact;
    }
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ncr = fac(n)/(fac(r)*fac(n-r));
        
        System.out.println(ncr);
    }
    }


