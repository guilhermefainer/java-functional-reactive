package section5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<String, Integer> fun =  e -> e.length();

        List<String> list =List.of("Guilherme", "Fainer", "Dalbem");
        System.out.println(map(list, fun));


    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> fun) {
        List<R> newList = new ArrayList();
        for (T elem:list) {
            newList.add(fun.apply(elem));
        }

        return newList;
    }
}