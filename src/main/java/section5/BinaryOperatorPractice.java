package section5;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {
    public static void main(String[] args) {
        BinaryOperator<String> bo = (a, b) -> a + "." + b;
        System.out.println(bo.apply("Gui", "Fainer"));
    }
}
