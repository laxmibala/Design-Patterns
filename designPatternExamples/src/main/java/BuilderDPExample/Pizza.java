package BuilderDPExample;

public class Pizza {

    //required fields
    private String pizzaType;
    private String baseSize;
    private boolean isVeg;
    //Optional Fields
    private boolean isExtraCheeseRequired;
    private String crustType;
    private String extraTopping;


    public String getPizzaType() {
        return pizzaType;
    }

    public String getBaseSize() {
        return baseSize;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public boolean isExtraCheeseRequired() {
        return isExtraCheeseRequired;
    }

    public String getCrustType() {
        return crustType;
    }

    public String getExtraTopping() {
        return extraTopping;
    }


    Pizza(PizzaBuilder pizzaBuilder) {
        this.pizzaType = pizzaBuilder.pizzaType;
        this.baseSize = pizzaBuilder.baseSize;
        this.isVeg =pizzaBuilder.isVeg;
        this.crustType=pizzaBuilder.crustType;
        this.extraTopping=pizzaBuilder.extraTopping;
        this.isExtraCheeseRequired=pizzaBuilder.isExtraCheeseRequired;
    }



    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaType='" + pizzaType + '\'' +
                ", baseSize='" + baseSize + '\'' +
                ", isVeg=" + isVeg +
                ", isExtraCheeseRequired=" + isExtraCheeseRequired +
                ", crustType='" + crustType + '\'' +
                ", extraTopping='" + extraTopping + '\'' +
                '}';
    }
}
