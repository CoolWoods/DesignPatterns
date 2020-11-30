package factory.abstractfactory;

import factory.abstractfactory.color.Color;
import factory.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String type);
    public abstract Color getColor(String type);
}
