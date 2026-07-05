### BUILDER PATTERN

- seperates object construction from its representation, allowing us to build step-by-step while keeping the object immutable adn readable

# PRIVATE CONSTRUCTOR
- the constructor of burger meal is made private so that the object creation is restricted to the Builder only.
- nested static BurgerBuilder class
   - this contains the same field as burgerMeal. It ensures immutability and keeps construction controlled

- Fluent API Style
  - each method (like withCheese, withSide) returns builder itself, enabling method chainig in a fluent readable manner.

- Selective Configuration
  - only required field(bunType, patty) are passed to the builder's constructor.
  - Everything else is optional and set using withXYZ() method

- Final Step: build()
  - once all desired fields are set, calling .build() finalizes the object construction and returns the BurgerMeal instance



### When to use builder pattern
 - An Object has multiple field, especially when many of them are optional
 - Immutability is preferred - Builder lets you construct an object step by step and then make it immutabe once built.
 - You want readable, maintainable object creation

 ### When to avoid Builder pattern

 - your class has only 1-2 field
 - you don't need object customization or immutability

 ### Pros and Cons of BuilderPattern
  # PROS
  - Avoids constructor telescoping
  - Ensures immutability
  - Clean, readable object creation
  - Great for complex configurations
  
  # CONS
  - slightly tough to setup
  - Overkill for small classes
  - Separate builder class needed

### REAL WORLD PRODUCTS USING BUILDER PATTERN

 # 1.> Lombok's @Builder Annotation
   - Java library that reduces boilerplate code using annotations. 
   - one of its popular features is the @Builder annotation, which automatically generates a builder class behind the scenes.

 /*
   @Builder
   public class User{
      private String name;
      private int age;
      private String address;
   }

   //now you can build Objects using a fluent API

   User use = User.builder()
               .name("Shubham")
               .age(22)
               .address("INDIA")
               .build();
 */

 # 2 .>  Amazon Cart Configuration
   - Think about Amazon's shopping cart system. When you add an item to your cart, you're not just storing an item ID. You're building a complex object with fields like:
   * Quantity
   * Size or color (for apparel)
   * Delivery option
   * Gift wrap
   * Save for later status
   * Discounted price or offer tag

   Each user may customize these options differently. Internally, such cart items are likely created using a Builder Pattern to allow step-by-step configuration while ensuring data consistency and immutability.