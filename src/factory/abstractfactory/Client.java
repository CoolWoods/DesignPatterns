package factory.abstractfactory;

import factory.abstractfactory.color.Color;
import factory.abstractfactory.shape.Shape;

public class Client {
    public static void main(String[] args) {

        AbstractFactory blueSquare = FactoryProducer.getFactory("blueSquare");
        AbstractFactory redCircle = FactoryProducer.getFactory("redCircle");
    }
}
