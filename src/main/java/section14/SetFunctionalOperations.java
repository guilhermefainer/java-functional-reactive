package section14;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetFunctionalOperations {

    public static void main(String[] args) {
        Set<Integer> set = Set.of(1, 56, 84, 100, 65, 86, 666, 45, 11, 13, 12);

        //traversal
        set.forEach(System.out::println);
        System.out.println("----------------------------");

        //filter
        set.stream().filter(i -> i%2==0).forEach(System.out::println);
        System.out.println("----------------------------");

        //sorting
        set.stream().sorted().forEach(System.out::println);
        System.out.println("----------------------------");

        set.stream().collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);
        System.out.println("----------------------------");

        //map
        Set<Double> doubles = set.stream().map(i -> Double.valueOf(i)).collect(Collectors.toSet());
        doubles.forEach(System.out::println);
        System.out.println("----------------------------");

        //reduce
        int sum = set.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
    }
}
