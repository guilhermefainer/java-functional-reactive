package section8.functionalComposition;

public class FunctionalComposition {
    public static void main(String[] args) {
        Function<Square, Integer> fun1 = Square::getArea;
        Function<Integer, Double> fun2 = area -> Math.sqrt(area);

        Function<Square, Double> getSide = fun2.compose(fun1);

        Square s = new Square();
        s.setArea(100);

        System.out.println(getSide.apply(s));
    }
}
