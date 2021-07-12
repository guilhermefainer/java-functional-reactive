package section8.closures;

public class JavaClosure {
    public static void main(String[] args) {
        int val = 111;

        Task lambda = () -> {
            System.out.println(val);
            System.out.println("Task completed");
        };

        printValue(lambda);

    }

    private static void printValue(Task lambda) {
        lambda.doTask();
    }
}