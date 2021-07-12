package section10.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntroduction {
    public static void main(String[] args) {

        //before java 8
        List<Book> list = new ArrayList<>();
        List<Book> popularHorrorBooks = new ArrayList<>();

        for (Book book : list) {
            if (book.getGenre().equalsIgnoreCase("Horror") &&
                    book.getRating() > 3) {
                popularHorrorBooks.add(book);
            }
        }

        // ----------------------------------------------
        // after java 8
        List<Book> horror = list.stream().filter(book -> book.getGenre().equalsIgnoreCase("horror")
                && book.getRating() > 3).collect(Collectors.toList());
        List<Book> horror2 = list.stream().parallel()
                .filter(book -> book.getGenre().equalsIgnoreCase("horror"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList());
    }
}
