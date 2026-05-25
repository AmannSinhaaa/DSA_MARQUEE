public class stringConcatnation {
    static String greet(String name){
        return ("Hello " + name);
    }

    public static void main(){
        String res = greet("World");
        System.out.println(res);
    }
}
