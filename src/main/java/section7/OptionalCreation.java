package section7;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        String val = "A String";
        Optional<String> optional = Optional.of(val);

        //empty
        Optional<Integer> empty = Optional.empty();

        //nullable
        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyOptional = Optional.ofNullable(null);


        //Unwrap
        Integer a = 10;
        Optional<Integer> opt = Optional.of(a);
        Integer intVal = opt.get();


        Optional<Integer> emptyOpt = Optional.empty();
        emptyOpt.get(); //exception NoSuchElement

        //isPresent
        Integer val2 = emptyOpt.isPresent() ? emptyOpt.get() : 0;

        //orElse
        Integer val3 = opt.orElse(0);

        //orElseGet
        Integer val4 = emptyOpt.orElseGet(() -> 0);

        //orElseThrow
        Integer val5 = emptyOpt.orElseThrow(() -> new IllegalArgumentException());
    }
}