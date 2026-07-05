package BuilderPattern.SingletonPattern;

class LazySingleton{
    public static LazySingleton instance;

    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}

/**
 * On Demand Initialization
 * tThey are not thread safe in multi-threaded environment and need synchronization in multi-threaded environment
 */