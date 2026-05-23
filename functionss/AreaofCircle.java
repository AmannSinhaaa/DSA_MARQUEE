public class AreaofCircle {
    
    static double area_circle(int r){
        double pi = 3.14;
        double area = pi * r * r;
        return area;
    }

    public static void main(){
        double rd = area_circle(7);
        System.out.println(rd);
    }
}
