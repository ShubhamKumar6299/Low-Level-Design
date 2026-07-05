package BuilderPattern.SingletonPattern;


public class SinchronizedSingleton {
    private static SinchronizedSingleton instance;

    private SinchronizedSingleton(){

    }

    public static synchronized SinchronizedSingleton getInstance(){
        if(instance == null){
            instance = new SinchronizedSingleton();
        }
        return instance;
    }
}

/**
 *    "Synchronized"  keyword ensures that only one thread can execute getInstance() at a time
 *    "PERFORMANCE OVERHEAD"  every call to getInstance()  is synchronized even if the instance is created
 *      may slow down the application in high concurrency scenarios
 */