package section8.chaining;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);

    default Consumer<T> thenAccept(Consumer<T> next) {
        return (T t) -> {
            this.accept(t);
            next.accept(t);
        };
    }
}
