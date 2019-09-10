package DecoratorExample;

public class ExtraTopping extends PizzaDecorator{
    public ExtraTopping(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding extra topping");
    }

    @Override
    public int getCost() {
        return temPizza.getCost()+100;
    }

    @Override
    public String getDescription(){
        return temPizza.getDescription()+"with extra topping ";
    }
}
