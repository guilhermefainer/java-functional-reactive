package section5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 35, 100, 2, 3, 50, 55);
        UnaryOperator<Integer> operator = i -> i * 100;
        System.out.println(mapper(list, operator));
    }

    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
        List<T> newList = new ArrayList<>();

        for (T t: list) {
            T e = operator.apply(t);
            newList.add(e);
        }

        return newList;
    }
}
