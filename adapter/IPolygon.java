package adapter;

import java.awt.Graphics;
import java.awt.Point;

/**
 * Created by Niklas on 2016-02-19.
 * Minor edits by Pelle on 2021-12-06
 */
public interface IPolygon {
    void paint(Graphics g);
    void updateCenter(int newX, int newY);
    Point getCenter();
}
