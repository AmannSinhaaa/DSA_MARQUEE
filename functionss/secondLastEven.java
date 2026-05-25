public class secondLastEven {
    static boolean even(int n){
        n = n / 10;
        int second_last = n % 10;
        if( second_last % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(){
        boolean result = even(12345);
        System.out.println(result);
    }
}
