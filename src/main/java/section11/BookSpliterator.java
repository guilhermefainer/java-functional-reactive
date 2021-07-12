package section11;

import java.util.Spliterator;
import java.util.function.Consumer;

public class BookSpliterator implements Spliterator<Book> {
    private String name;
    private String Author;
    private String genre;
    private double rating;
    private Spliterator<String> baseSpliterator;

    public BookSpliterator(Spliterator<String> baseSplit) {
        this.baseSpliterator = baseSplit;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Book> consumer) {
        if (this.baseSpliterator.tryAdvance(name -> this.name = name) &&
                this.baseSpliterator.tryAdvance(author -> this.Author = Author) &&
                this.baseSpliterator.tryAdvance(genre -> this.genre = genre) &&
                this.baseSpliterator.tryAdvance(rating -> this.rating = Double.valueOf(rating))) {
            consumer.accept(new Book(name, Author, genre, rating));
            return true;
        }
        return false;
    }

    @Override
    public Spliterator<Book> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return baseSpliterator.estimateSize()/4;
    }

    @Override
    public int characteristics() {
        return baseSpliterator.characteristics();
    }
}
