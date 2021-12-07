package adapter;

import java.awt.Graphics;
import java.awt.Point;

import shapes.Polygon;

/**
 * Created by Niklas on 2016-02-21.
 *
 */
/* package-private */ class PolygonWrapper implements IPolygon {
    private final Polygon wrappedPolygon;

    PolygonWrapper(Polygon toBeWrapped) {
        this.wrappedPolygon = toBeWrapped;
    }

    @Override
    public void paint(Graphics g) {
        this.wrappedPolygon.paint(g);
    }

    /* This is where the magic happens */
    @Override
    public void updateCenter(int newX, int newY) {
        Point oldCenter = this.wrappedPolygon.getCenterPoint();
        this.wrappedPolygon.translate(newX - oldCenter.x, newY - oldCenter.y);
    }

    @Override
    public Point getCenter() {
        return this.wrappedPolygon.getCenterPoint();
    }
}
