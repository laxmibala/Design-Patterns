package BuilderDPExample;

public class DominosOrder {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder("country feast","small",true).build();
        System.out.println(pizza);

        Pizza specialPizza =new PizzaBuilder("tandoori chicken","large",true).setCrustType("thin").setExtraCheeseRequired(true).setExtraTopping("onion").
                build();
        System.out.println(specialPizza);
    }
}
