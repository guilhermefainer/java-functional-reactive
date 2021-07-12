package section5;

import java.util.function.Supplier;

public class SuplierPractice {
    public static void main(String[] args) {
        Supplier<String> suplier = () -> new String("A String");

        System.out.println(suplier.get());

        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}
