package factory.abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "blueSquare":
                return new BlueSquareFactory();
            case "redCircle":
                return new RedCircleFactory();
            default: return null;
        }
    }
}
