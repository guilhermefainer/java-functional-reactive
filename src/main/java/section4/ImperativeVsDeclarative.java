package section4;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {

        //Imperative
        int sumOfEvens = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                sumOfEvens = sumOfEvens + i;
            }
        }
        System.out.println(sumOfEvens);
        //end of Impetative

        sumOfEvens = 0;

        //Declarative
        sumOfEvens = IntStream.rangeClosed(0, 99)
                .filter(x -> x % 2 ==0)
                .reduce((x, y) -> x + y)
                .getAsInt();
        System.out.println(sumOfEvens);
        //end of Declarative
    }
}
