package functions;

import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        int result = process(square, 5);
//        int result = process((x -> x * x), 5);
        System.out.println(result); // 25
    }

    public static int process(Function<Integer, Integer> func, int num) {
        return func.apply(num);
    }

}
