package bridge;

import bridge.color.impl.Black;
import bridge.color.impl.Blue;
import bridge.color.impl.Green;
import bridge.color.impl.Red;
import bridge.pen.Pen;
import bridge.pen.impl.BigPen;
import bridge.pen.impl.MiddlePen;
import bridge.pen.impl.SmallPen;

public class Client {
    public static void main(String[] args) {
        Pen bigPen = new BigPen();
        bigPen.setColor(new Red());
        bigPen.draw("flower");

        Pen smallPen = new SmallPen();
        bigPen.setColor(new Green());
        bigPen.draw("flower");

        Pen middlePen = new MiddlePen();
        bigPen.setColor(new Blue());
        bigPen.draw("flower");

        System.out.println("----------------分割线----------------");

        // 新加入一种颜色测试
        Pen bigPen1 = new BigPen();
        Pen middlePen1 = new MiddlePen();
        Pen smallPen1 = new SmallPen();

        bigPen1.setColor(new Black());
        middlePen1.setColor(new Black());
        smallPen1.setColor(new Black());

        bigPen1.draw("flower");
        middlePen1.draw("flower");
        smallPen1.draw("flower");
    }
}
