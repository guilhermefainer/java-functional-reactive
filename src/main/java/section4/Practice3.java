package section4;

public class Practice3 {
    public static void main(String[] args) {
        MyFunctionalInterface3 strLength = (s) -> s.length();
        System.out.println(strLength.myMethod("dois"));
    }
}
