package functions;

import java.util.function.IntUnaryOperator;

public class Functions {

    public static void main(String[] args) {
        IntUnaryOperator square = x -> x * x;
        int result = process(square, 5);
//        int result = process((x -> x * x), 5);
        System.out.println(result); // 25
    }

    public static int process(IntUnaryOperator func, int num) {
        return func.applyAsInt(num);
    }

}
