package section5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Guilherme");
        list.add("Fainer");
        list.add("");
        list.add("Dalbem");

        Predicate<String> predicate = s -> !s.isBlank();

        List<String> newList = filterList(list, predicate);
        System.out.println(newList);

        List<Integer> integerList = List.of(1, 5, 6, 7, 8, 10);
        Predicate<Integer> integerPredicate = i -> i % 2 == 0;
        System.out.println(filterList(integerList, integerPredicate));
    }

//    private static List<String> filterList(List<String> list, Predicate<String> predicate) {
//        List<String> newList = new ArrayList<>();
//        for (String string:list) {
//            if(predicate.test(string))
//                newList.add(string);
//        }
//        return newList;
//    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();
        for (T string : list) {
            if (predicate.test(string))
                newList.add(string);
        }
        return newList;
    }

}
