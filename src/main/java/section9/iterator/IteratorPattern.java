package section9.iterator;

public class IteratorPattern {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(new Object[] {10,2,6,6,67});
        list.forEach(System.out::println);
    }
}
