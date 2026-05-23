public class IsPrime {
    
    public static boolean prime(int a){
        if(a <= 1){
            return false;
        }
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(){
        boolean ans = prime(9);
       if(ans == true){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
    }
}
