package BuilderPattern.BuilderPattern;
import java.util.*;


class BurgerMeal{
    //required components
    private final String bunType;
    private final String patty;

    //Optional Component
    private final boolean hasCheese;
    private final List<String>toppings;
    private final String drink;

    //private constructor to force use of Builder
    private BurgerMeal(BurgerBuilder builder){
        this.bunType = builder.bunType;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.toppings = builder.toppings;
        this.drink = builder.drink;
    }

    //static nested Builder class
    public static class BurgerBuilder{
        //required Component
        private final String bunType;
        private final String patty;

        //optional Component
        private  boolean hasCheese;
        private List<String>toppings;
        private String drink;

        //builder constructor with required field
        public BurgerBuilder(String bunType, String patty){
            this.bunType = bunType;
            this.patty = patty;
        }

        //method to set Cheese
        public BurgerBuilder withCheese(boolean hasCheese){
            this.hasCheese = hasCheese;
            return this;
        }
        public BurgerBuilder withToppings(List<String>toppings){
            this.toppings = toppings;
            return this;
        }

        public BurgerBuilder withDrink(String drink){
            this.drink = drink;
            return this;
        }

        //final build method
        public BurgerMeal build(){
            return new BurgerMeal(this);
        }
    }
    //just putting getters
    public String getBunType(){
        return bunType;
    }
    public String getPatty(){
        return patty;
    }
}
class Builder {
    public static void main(String[] args) {
        // Creating burger with only required fields
        BurgerMeal plainBurger = new BurgerMeal.BurgerBuilder("wheat", "veg")
                                    .build();

        // Burger with cheese only
        BurgerMeal burgerWithCheese = new BurgerMeal.BurgerBuilder("wheat", "veg")
                                        .withCheese(true)
                                        .build();

        System.out.println(plainBurger.getBunType());
        System.out.println(burgerWithCheese);

        // Fully loaded burger
        // List<String> toppings = Arrays.asList("lettuce", "onion", "jalapeno");
        // BurgerMeal loadedBurger = new BurgerMeal.BurgerBuilder("multigrain", "chicken")
        //                                 .withCheese(true)
        //                                 .withToppings(toppings)
        //                                 .withSide("fries")
        //                                 .withDrink("coke")
        //                                 .build();
    }
}
