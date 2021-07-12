package section5;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 14, 11, 253, 66, 666);
        Consumer<Integer> consumer = e -> System.out.println(e);
        consumer.accept(56);

        printAllElements(integerList, consumer);
    }

    private static <T> void printAllElements(List<T> list, Consumer<T> consumer) {
        for (T a:list) {
            consumer.accept(a);
        }
    }
}
