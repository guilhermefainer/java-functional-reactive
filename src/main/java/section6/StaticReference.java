package section6;

import java.util.function.BiFunction;

public class StaticReference {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = (a,b) -> A_Class.staticMethod(a,b);

        System.out.println(biFunction.apply("Gui", "lherme"));
    }
}

class A_Class {
    static String staticMethod(String a, String b) {
        return a+b;
    }
}
