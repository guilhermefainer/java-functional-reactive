package section13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class CustomCollector {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 6, 8, 9, 0, 1, 52, 5, 61, 8, 9, 96, 0, 18, 23);
        Collector<Integer, List<Integer>, List<Integer>> toList =
                Collector.of(ArrayList::new, //supplier
                        (list, e) -> list.add(e), //BiConsumer
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        }, //BiFunction
                        Collector.Characteristics.IDENTITY_FINISH);

        List<Integer> evens = numbers.stream().filter(e -> e % 2 == 0).collect(toList);
        evens.forEach(System.out::println);

        Collector<Integer, List<Integer>, List<Integer>> toSortedList =
                Collector.of(ArrayList::new, //supplier
                        (list, e) -> list.add(e), //BiConsumer
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        },
                        (list) -> {
                            Collections.sort(list);
                            return list;
                        },
                        Collector.Characteristics.UNORDERED);

        List<Integer> list = numbers.stream().collect(toSortedList);
        list.forEach(System.out::println);
    }
}
