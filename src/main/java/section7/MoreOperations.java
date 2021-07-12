package section7;

import javax.swing.text.html.Option;
import java.util.Optional;

public class MoreOperations {
    public static void main(String[] args) {

        //ifPresent
        Optional<String> optional = Optional.of("Valor");
        optional.ifPresent(System.out::println);

        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty"));

        optional.or(() -> Optional.of("New Value")).ifPresent(System.out::println);
    }
}
