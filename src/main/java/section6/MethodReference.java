package section6;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out :: println;

        Supplier<Double> random = Math :: random;

        BiFunction<String, String, String> biFunction = A_Class :: staticMethod;

        Function<String, Integer> fun = String :: length;

        consumer.accept(56);
        System.out.println(random.get());
    }
}
