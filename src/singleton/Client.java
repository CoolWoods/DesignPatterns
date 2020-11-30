package singleton;

public class Client {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.sayHai();

        SingleObjectLazy singleObjectLazy = SingleObjectLazy.getInstance();
        singleObjectLazy.sayHai();

        SingleObjectDCL singleObjectDCL = SingleObjectDCL.getInstance();
        singleObjectDCL.sayHai();
    }
}
