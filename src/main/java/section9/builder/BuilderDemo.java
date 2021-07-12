package section9.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        MobileBuilder builder = new MobileBuilder();
        Mobile mobile = builder.with(myBuilder -> {
            myBuilder.ram = 4;
            myBuilder.batery = 4000;
            myBuilder.processor = "A12";
        }).createMobile();

        System.out.println(mobile);
    }
}
