package BuilderPattern.SingletonPattern;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){

    }
    public static DoubleCheckedLockingSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}

/**
 * the outer if avoids the synchronization if instance is already created 
 * inner if inside synchronized insures only one instance is created
 * volatile ensures that the changes made by oen thread is visible to all and makes sure that the instance is always read from the main memory
 * 
 * requires java1.5 or above due to the reliance on volatile keyword
 */
