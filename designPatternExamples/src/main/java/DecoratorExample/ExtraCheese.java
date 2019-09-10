package DecoratorExample;

public class ExtraCheese extends PizzaDecorator {
    public ExtraCheese(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding extra cheese");
    }

    @Override
    public int getCost() {
        return temPizza.getCost()+50;
    }

    @Override
    public String getDescription(){
        return temPizza.getDescription()+"with extra cheese ";
    }

}
