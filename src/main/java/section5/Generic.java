package section5;

public class Generic {
    public static void main(String[] args) {
        GenericInterface<String, Integer> fun = (s) -> Integer.valueOf(s);

        System.out.println(fun.execute("2440"));
    }
}
