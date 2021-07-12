package section12.downstream;

import section12.Employee;
import section12.EmployeeSpliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class DownstreamCollectors {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Gui\\repositorios\\java\\functional-programming\\src\\section12\\EmployeeData.txt");
        try (Stream<String> lines = Files.lines(path)) {
            Spliterator<String> wordSpliterator = lines.flatMap(line -> Arrays.stream(line.split(","))).spliterator();
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);
            List<Employee> employeeList = StreamSupport.stream(employeeSpliterator, false).collect(Collectors.toList());

            Map<String, Long> countByDesignation = employeeList.stream()
                    .collect(
                            Collectors.groupingBy(e -> e.getDesignation(), Collectors.counting())
                    );

            System.out.println(countByDesignation);

            Map<String, Double> fundDistribuition = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDesignation(), Collectors.summingDouble(e -> e.getSalary())));
            System.out.println(fundDistribuition);

            Map<String, Optional<Employee>> maxSalaryEmployees = employeeList.stream().collect(
                    Collectors.groupingBy(e -> e.getDesignation(),
                            Collectors.maxBy(Comparator.comparing(e -> e.getSalary()))));

            System.out.println(maxSalaryEmployees);

//            Map<String, Optional<Double>> maxSalaries = employeeList.stream()
//                    .collect(
//                            Collectors.groupingBy(
//                                    e -> e.getDesignation(),
//                                    Collectors.mapping(e -> e.getSalary(),
//                                            Collectors.maxBy(Comparator.comparing(Function.identity()))
//                                    )
//                            )
//                    );
//
//            System.out.println(maxSalaries);


        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
