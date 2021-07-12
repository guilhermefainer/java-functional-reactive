package section9.builder;

import section8.chaining.Consumer;

public class MobileBuilder {
    int ram;
    int storage;
    int batery;
    int camera;
    String processor;
    Double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> buildFields){
        buildFields.accept(this);
        return this;
    }

    public Mobile createMobile() {
        return new Mobile(this);
    }
}
