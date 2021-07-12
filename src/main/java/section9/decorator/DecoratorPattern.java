package section9.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
//        Burger myOrder = new BurgerShop(burger -> burger.addVeggies()).use(new Burger());
        Burger myOrder = new BurgerShop(b -> b.addCheese()).use(new BurgerShop(burger -> burger.addVeggies()).use(new Burger()));
        System.out.println("I get:" + myOrder);
    }
}
