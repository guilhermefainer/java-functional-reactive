package section14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ListFunctionalOperations {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Jogos Mortais", 1999, "Hollywood"),
                new Movie("Cinderela", 1970, "Hollywood"),
                new Movie("Estranho no ninho", 2008, "Hollywood"),
                new Movie("Dançando no escuro", 2001, "Hollywood"),
                new Movie("3 idiots", 2001, "Bollywood")
        );

        //traversal
        movies.forEach(System.out::println);
        System.out.println("----------------------------");

        //sorting
        movies.sort((o1, o2) -> o2.getReleaseYear() - o1.getReleaseYear());
        movies.forEach(System.out::println);
        System.out.println("----------------------------");


        movies.stream().filter(movie -> movie.getIndustry().equalsIgnoreCase("Bollywood"))
                .forEach(System.out::println);
        System.out.println("----------------------------");

        //mapping
        movies.stream().map(m -> m.getName()).forEach(System.out::println);
        System.out.println("----------------------------");

        //reduce
        Optional<String> reduce = movies.stream().map(m -> m.getName()).reduce((m1, m2) -> m1 + " | " + m2);
        System.out.println(reduce);
    }
}
