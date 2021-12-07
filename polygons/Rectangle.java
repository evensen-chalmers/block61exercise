package polygons;

import java.awt.Graphics;

/**
 * Created by Niklas on 2016-01-19.
 * Minor edits by Pelle on 2021-12-06
 */
class Rectangle extends Polygon {
	Rectangle(int x, int y) {
		super(x, y);
	}

	@Override
	public void paint(Graphics g) {
		g.drawRect(this.centerPoint.x - 20, this.centerPoint.y - 10, 40, 20);
	}
}
