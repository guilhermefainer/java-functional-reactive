package section5;

import java.util.function.BiFunction;

public class BiFunctionPractice {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunc = (a, b) -> a.concat(b);
        BiFunction<String, String, Integer> biFunc2 = (a, b) -> a.concat(b).length();
        System.out.println(biFunc.apply("Guilherme", "Fainer"));
        System.out.println(biFunc2.apply("Guilherme", "Fainer"));
    }
}
