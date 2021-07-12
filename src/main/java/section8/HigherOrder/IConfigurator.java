package section8.HigherOrder;

public interface IConfigurator<T, R> {
    R configure(T t);
}
