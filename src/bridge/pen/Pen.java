package bridge.pen;

import bridge.color.Color;

public abstract class Pen {
  private Color color;
  public void setColor(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  public abstract void draw(String name);
}
