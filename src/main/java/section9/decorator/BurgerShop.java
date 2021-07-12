package section9.decorator;

import java.util.function.Function;

public class BurgerShop {
    Function<Burger, Burger> decoration;

    public Burger use(Burger baseBurguer) {
        System.out.println("Base burger:" + baseBurguer);
        return decoration.apply(baseBurguer);
    }

    public BurgerShop(Function<Burger, Burger> decoration) {
        this.decoration = decoration;
    }
}
