package section7;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Operations {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Valor");
        Optional<String> emptyOptional = Optional.empty();

        //map
        var val1 = emptyOptional.map(s -> "Replaced").orElse("Empty");
        System.out.println(val1);

        //filter
        Optional<String> filter = optional.filter(val -> val.equals("Valor"));
        System.out.println(filter);

        //flatMap
        Optional<String> flatmap = optional.flatMap(val -> Optional.of("Flatmap!!"));
        System.out.println(flatmap.get());
    }
}
