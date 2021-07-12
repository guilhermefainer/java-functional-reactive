package section14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MapFunctionalOperations {

    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        contacts.put("1111555454874", "Guilhermne");
        contacts.put("2", "Fainer");
        contacts.put("3", "Dalbem");
        contacts.put("45", "heheboy");
        contacts.put("5", "GME");

        //traversal
        for (Map.Entry<String, String> entry: contacts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("------------------------------");

        contacts.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("------------------------------");

        //Filter
        contacts.entrySet().stream().filter(c -> "GME".equalsIgnoreCase(c.getValue()))
                .forEach(System.out::println);
        System.out.println("------------------------------");

        Map<String, String> collect = contacts.entrySet().stream().filter(c -> "Fainer".equalsIgnoreCase(c.getValue()))
                .collect(Collectors.toMap(c -> c.getKey(), c -> c.getValue()));
        collect.forEach((k, v) -> System.out.println(k + " -" + v));
        System.out.println("------------------------------");

        //Map
        contacts.entrySet().stream()
                .distinct()
                .map(c -> c.getValue())
                .forEach(System.out::println);
        System.out.println("------------------------------");

        String collect1 = contacts.entrySet().stream()
                .distinct()
                .map(c -> c.getValue())
                .collect(Collectors.joining(" , "));
        System.out.println(collect1);
        System.out.println("------------------------------");


        //sorting
        LinkedHashMap<String, String> sortedMap = contacts.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(c -> c.getKey(), c -> c.getValue(),
                        (v1, v2) -> v1,
                        LinkedHashMap::new));

        sortedMap.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("------------------------------");

        //reduce
        Map<String, Double> marks = new HashMap<>();
        marks.put("Science", 66.0);
        marks.put("Maths", 12.0);
        marks.put("English", 74.0);
        marks.put("Portuguese", 13.0);

        OptionalDouble average = marks.values().stream().mapToDouble(m -> m).average();
        System.out.println(average.getAsDouble());
    }

}
