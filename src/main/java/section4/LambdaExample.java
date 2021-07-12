package section4;

public class LambdaExample {
    public static void main(String[] args) {
//        section4.MyRunnable runnable = new section4.MyRunnable();
//        Thread t = new Thread(runnable);
//        t.start();

        Thread t = new Thread(() -> System.out.println("lambda"));
        t.start();

        MyFunctionalInterface fun = () -> System.out.println("functional interface");
        fun.myMethod(); //out "functional interface"
        onTheFly(() -> System.out.println("On the fly"));
    }

    public static void onTheFly(MyFunctionalInterface fun) {
        fun.myMethod();
    }
}
