public class sumofwhole {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0){
            sum += i;
            }
        }
        System.out.println("Sum of multiple of 3 between 1 to 20 is: " + sum);
    }
}
