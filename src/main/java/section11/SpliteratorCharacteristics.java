package section11;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class SpliteratorCharacteristics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(99);

        Stream<Integer> stream = list.stream();
        Spliterator<Integer> spliterator = stream.spliterator();
        int characteristics = spliterator.characteristics();

        System.out.println(Integer.bitCount(characteristics)); // 3 características

        //or
        System.out.println(Integer.bitCount(characteristics | 0x00000010)); // ORDERED <- já possui então nada vai mudar

        //and
        System.out.println(Integer.bitCount(characteristics & 0x00000010));


        System.out.println(spliterator.hasCharacteristics(0x00000010));
    }
}
