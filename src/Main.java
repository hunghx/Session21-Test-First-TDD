public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Vieets test case cho chuoi Fibonaci
    }
    public static boolean isPrice(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i==0){
                return false; // ko phai snt
            }
        }
       return number>1;
    }
}