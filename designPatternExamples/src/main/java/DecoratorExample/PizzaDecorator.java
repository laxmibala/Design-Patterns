package DecoratorExample;

public abstract class PizzaDecorator implements Pizza {
   protected Pizza temPizza;

    public PizzaDecorator(Pizza temPizza) {
        this.temPizza = temPizza;
    }
    public int getCost(){
        return temPizza.getCost();
    }
    public String getDescription(){
        return temPizza.getDescription();
    }

}
