public class maxofthree {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 30;

        int max = (a > b && a > c) ? a : ( b > a && b > c) ? b : c;
        System.out.println(max);
        
    }
}
