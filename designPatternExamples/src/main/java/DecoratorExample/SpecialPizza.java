package DecoratorExample;

public class SpecialPizza implements Pizza {

    @Override
    public int getCost() {
        return 199;
    }

    @Override
    public String getDescription() {
        return "Special pizza ";
    }
}
