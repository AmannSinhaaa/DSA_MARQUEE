public class func2 {

    static int Even(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(){
        int result = Even(10,20);
        System.out.println(result);
    }

}
