package factory.abstractfactory;

import factory.abstractfactory.color.Color;
import factory.abstractfactory.color.Red;
import factory.abstractfactory.shape.Circle;
import factory.abstractfactory.shape.Shape;

public class RedCircleFactory extends AbstractFactory {

    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}
