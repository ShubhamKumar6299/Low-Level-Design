package BuilderPattern.SingletonPattern;

class EagerSingleton{
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}


/**
 *  private constructor
 *  private Static variable(final in case of eager singleton)
 *  public static method for global point of access
 * 
 */



