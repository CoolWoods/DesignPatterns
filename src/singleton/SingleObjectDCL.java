package singleton;

public class SingleObjectDCL {
    private static SingleObjectDCL instance;

    private SingleObjectDCL(){}
    public static SingleObjectDCL getInstance() {
        if (instance == null){
            synchronized (SingleObjectDCL.class){
                if (instance == null)
                    instance = new SingleObjectDCL();
            }
        }
        return instance;
    }
    public void sayHai(){
        System.out.println("Hello DCL Singleton!");
    }
}
