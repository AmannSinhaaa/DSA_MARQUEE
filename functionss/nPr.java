import java.util.*;

public class nPr {
    static int factt(int f){
        int fac = 1;
        for(int i = 1; i <= f; i++){
            fac *= i;
        }
        return fac;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int npr = factt(n)/(factt(n-r));
        System.out.println(npr);
    }
}
