### Factory Design Pattern

-- creational design pattern


# provides interface to create object but allows subclass to alter the type of object that will be created
-- rather than directly calling the constructor to create an object,  we use a factory method to create that object based on some input or condition

-- client code needs to run with multiple kind of objects
-- the desision of which class to instanciate must be made at runtime
-- instantialtion is complex and needs to be controlled


#  Basic structure of factory pattern
 - Product : an interface or abstract class that defines the method the product must implement
 - Concrete products : the concrete class that implements the Product interface
 - Factory  : A class with a method that returns different concrete products based on input

 