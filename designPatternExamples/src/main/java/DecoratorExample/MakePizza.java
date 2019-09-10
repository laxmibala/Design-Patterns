package DecoratorExample;

public class MakePizza {
    public static void main(String[] args) {
        Pizza customizedPizza = new ExtraTopping(new ExtraCheese(new SpecialPizza()));
        System.out.println("Pizza description: "+customizedPizza.getDescription());
        System.out.println("Pizza Cost: "+customizedPizza.getCost());

        Pizza customPizza =new ExtraCheese(new ExtraCheese(new PlainPizza()));
        System.out.println("Pizza description: "+customPizza.getDescription());
        System.out.println("Pizza Cost: "+customPizza.getCost());


    }
}
