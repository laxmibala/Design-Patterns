package DecoratorExample;

public class PlainPizza implements Pizza {
    public final int baseCost=99;
    @Override
    public int getCost() {
        return baseCost;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza ";
    }


}
