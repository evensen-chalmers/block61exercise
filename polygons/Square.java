package polygons;

import java.awt.Graphics;

/**
 * Created by Niklas on 2016-01-19.
 */
class Square extends Polygon {
    Square(int x, int y) {
        super(x,y);
    }

   @Override
    public void paint(Graphics g){
        g.drawRect(this.centerPoint.x - 10, this.centerPoint.y - 10, 20, 20);
    }
}
