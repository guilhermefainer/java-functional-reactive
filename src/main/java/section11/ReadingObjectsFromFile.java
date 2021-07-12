package section11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadingObjectsFromFile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\Gui\\Downloads\\Books.txt");

        try (Stream<String> lines = Files.lines(path)) {
            Spliterator<String> baseSplit = lines.spliterator();
            Spliterator<Book> spliterator = new BookSpliterator(baseSplit);

            Stream<Book> stream = StreamSupport.stream(spliterator, false);
            stream.forEach(System.out::println);

        } catch (IOException e) {

        }

    }
}
