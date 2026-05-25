public class countDigit {
    static int countt(int n){
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(){
        int res = countt(12345);
        System.out.println(res);
    }
}
