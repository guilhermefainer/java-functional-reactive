package section5;

@FunctionalInterface
public interface GenericInterface<T, R> {
    R execute(T t);
}