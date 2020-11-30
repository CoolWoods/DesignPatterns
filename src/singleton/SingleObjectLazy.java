package singleton;

public class SingleObjectLazy {
    private static SingleObjectLazy instance;
    private SingleObjectLazy(){}
    public synchronized static SingleObjectLazy getInstance(){
        if (instance == null) {
            instance = new SingleObjectLazy();
        }
        return instance;
    }
    public void sayHai(){
        System.out.println("Hello Lazy Singleton!");
    }
}
