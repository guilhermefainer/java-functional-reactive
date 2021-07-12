package section9.fluent;

public class FluentShopping {
    public static void main(String[] args) {
        //1
//        Order myOrder = new Order();
//        myOrder.add("Shoes");
//        myOrder.add("Smartphone");
//
//        myOrder.deliverAt("Alice Vieira Ranieri 265");
//        myOrder.place();

        //2
//        new Order().add("Shoes").add("Smartphone").deliverAt("Alice Vieira Ranieri 265").place();


        //3
        Order.place(order -> order.add("Shoes").add("Headphones").add("Wallet").deliverAt("Home"));
    }
}
