import java.util.*;
public class hollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= m; k++){

                if(i == 1 || k == 1 || i == n || k == m){
                    System.out.print("*");
                } else{
                System.out.print(" ");
                }
            }
                System.out.println();
        }

    }
}
