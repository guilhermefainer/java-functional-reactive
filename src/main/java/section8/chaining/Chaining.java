package section8.chaining;

public class Chaining {
    public static void main(String[] args) {
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = System.out::println;

        c1.accept("Hello");
        c2.accept("!!");

        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        };

        c3.accept("Example");


        Consumer<String> c4 = c1.thenAccept(c2);
        c4.accept("Chaining ex");
    }
}
