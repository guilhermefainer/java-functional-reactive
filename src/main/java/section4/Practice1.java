package section4;

public class Practice1 {
    public static void main(String[] args) {
        MyFunctionalInterface name = () -> System.out.println("John");
        name.myMethod();
    }
}
