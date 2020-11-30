package bridge.pen.impl;

import bridge.pen.Pen;

public class SmallPen extends Pen {
    @Override
    public void draw(String name) {
        System.out.println(name + " draw by " + this.getClass().getSimpleName()+ " with " + this.getColor().color());
    }
}
