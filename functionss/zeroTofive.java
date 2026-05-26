public class zeroTofive {
    static int check(int n){
        int res = 0;
        while(n > 0){
            int dig = n % 10;
            n =  n / 10;
            if(dig == 0){
                res = res*10+5;
            } else{
                res = res*10+dig;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int result = check(1000);
        System.out.println(result);
    }
}
