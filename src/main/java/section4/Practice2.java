package section4;

public class Practice2 {
    public static void main(String[] args) {
        MyFunctionalInterface2 operation = (a, b) -> System.out.println(a + b);
        operation.myMethod(5, 2);
    }
}
