public class stair {
    public static void main(String[] args) {
        int star = 2;

        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= star; j++){
                System.out.print("• ");
            }
            System.out.println();

            if(i % 2 == 0){
                star += 2;
            }
        }
    }
}
