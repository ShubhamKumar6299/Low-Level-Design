package BuilderPattern.FactoryMethod;

// STEP1 : INTERFACE

interface Notification{
    //methods in interface are implicitly public abstract
    void notifyUser();
}
// STEP2 : IMPLEMENTATIONS

class EmailNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending Email");
    }
}

class SMSNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending SMSNotification");
    }
}

// STEP3 : FACTORY

class NotificationFactory {
    public Notification createNotification(String type){
        if(type.equalsIgnoreCase("Email")){
            //upcasting
            return new EmailNotification();
        }
        if(type.equalsIgnoreCase("SMS")){
            //upcasting
            //reference type is notification but the actual object is SMSNotification()
            //this brings polymorphism, so client doesn't care which implementation it receives
            return new SMSNotification();
        }

        return null;
    }
}

//STEP4 : CLIENT

public class Factory01 {
    public static void main(String[]args){
        //since in NotificationFactory we don't have any constructor so default constructor is called 
        //public NotificationFactory(){}
        NotificationFactory factory = new NotificationFactory();
        // Notification notification = factory.createNotification(type);
        Notification notification = factory.createNotification("email");

        notification.notifyUser();
    }
}


/*

Client
   |
   | asks for Notification
   |
   v
NotificationFactory
   |
   | creates object
   |
   +-------------------------+
   |                         |
   v                         v
EmailNotification      SMSNotification
   |                         |
   +-----------implements-----+
               Notification


               "The factory returns the interface to hide the concrete
                implementation from the client. The client depends only
                 on the abstraction, not on specific classes, which reduces
                  coupling and makes it easy to add new implementations without
                   changing client code. The actual object is created inside
                    the factory and returned as an interface reference
                     through polymorphism."

-   loose coupling
-   easy extension
-   encapsulates object creation
-   follows Open/Closed principle

 */