package BuilderPattern.SingletonPattern;

public class BillPughSingleton {
    private BillPughSingleton(){

    }

    private static class Holder{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return Holder.INSTANCE;
    }
}

class Main{
    public static void main(String[] args){
        BillPughSingleton instance1 = BillPughSingleton.getInstance();
        BillPughSingleton instance2 = BillPughSingleton.getInstance();
    }
}


/**
 * singleton instance is not created until getInstance() is called
 * the static inner class(Holder) is not loaded until referenced, thanks to java's class loading mechanism
 * thred safety + lazy loading + high performance without synchronized overhead
 * 
 *          Singleton
            │
            ├── Holder (NOT loaded)

            Holder class is not loaded until getInstance() method is called

 */