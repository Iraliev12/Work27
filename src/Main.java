import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(20));
    }
    public  static double sqrt(double num){
        UnaryOperator<Double>mon=(number)->Math.sqrt(num);
        return mon.apply(num);
    }
}