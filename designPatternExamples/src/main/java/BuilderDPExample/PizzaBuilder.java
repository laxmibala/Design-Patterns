package BuilderDPExample;

public class PizzaBuilder {

    //required fields
    public String pizzaType;
    public String baseSize;
    public boolean isVeg;

    //Optional Fields
    public boolean isExtraCheeseRequired;
    public String crustType;
    public String extraTopping;

    public PizzaBuilder(String pizzaType,String baseSize,Boolean isVeg) {
        this.pizzaType = pizzaType;
        this.baseSize = baseSize;
        this.isVeg =isVeg;
    }

    public PizzaBuilder setCrustType(String crustType) {
        this.crustType = crustType;
        return this;
    }

    public PizzaBuilder setBaseSize(String baseSize) {
        this.baseSize = baseSize;
        return this;
    }

    public PizzaBuilder setExtraTopping(String extraTopping) {
        this.extraTopping = extraTopping;
        return this;
    }

    public PizzaBuilder setExtraCheeseRequired(boolean extraCheeseRequired) {
        this.isExtraCheeseRequired=extraCheeseRequired;
        return this;
    }

    public Pizza build() {
       return new Pizza(this) ;
    }



}
