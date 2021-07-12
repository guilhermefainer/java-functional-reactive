package section4;

public class Practice4 {
    public static void main(String[] args) {
        MyFunctionalInterface4 fun = s -> {
            int l = s.length();
            System.out.println("Length is: " + l);
            return l;
        };
        fun.myMethod("Test. e");
    }
}
