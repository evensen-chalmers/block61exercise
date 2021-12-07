package polygons;

import java.awt.Graphics;

/**
 * Created by Niklas on 2016-01-19.
 */
class Triangle extends Polygon {
    Triangle(int x, int y) {
        super(x,y);
    }

    @Override
    public void paint(Graphics g){
        g.drawLine(this.centerPoint.x, this.centerPoint.y-10, this.centerPoint.x-10, this.centerPoint.y+10);
        g.drawLine(this.centerPoint.x-10, this.centerPoint.y+10,
                this.centerPoint.x+10, this.centerPoint.y+10);
        g.drawLine(this.centerPoint.x+10, this.centerPoint.y+10, this.centerPoint.x, this.centerPoint.y-10);
    }
}
