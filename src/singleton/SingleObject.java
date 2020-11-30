package singleton;

public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    public void sayHai(){
        System.out.println("Hello Hungry Singleton!");
    }
}
