package factory.abstractfactory;

import factory.abstractfactory.color.Blue;
import factory.abstractfactory.color.Color;
import factory.abstractfactory.shape.Shape;
import factory.abstractfactory.shape.Square;

public class BlueSquareFactory extends AbstractFactory{
    @Override
    public Shape getShape(String type) {
        return new Square();
    }

    @Override
    public Color getColor(String type) {
        return new Blue();
    }
}
