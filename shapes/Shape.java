package shapes;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

/**
 * Created by Niklas on 2016-02-14. Minor edits by Pelle on 2021-12-06
 */
public abstract class Shape extends JComponent {
	private final Point centerPoint;
	private int scaleX = 10;
	private int scaleY = 10;
	private double rotation = 0; // Degrees clockwise

	public Point getCenterPoint() {
		return this.centerPoint;
	}

	public int getScaleX() {
		return this.scaleX;
	}

	public int getScaleY() {
		return this.scaleY;
	}

	public double getRotation() {
		return this.rotation;
	}

	private Shape(Point center) {
		this.centerPoint = center;
	}

	public Shape(int x, int y) {
		this(new Point(x, y));
	}

	public void translate(int x, int y) {
		this.centerPoint.move(this.centerPoint.x + x, this.centerPoint.y + y);
	}

	public void scale(int x, int y) {
		this.scaleX = this.scaleX * x;
		this.scaleY = this.scaleY * y;
	}

	public void rotate(double angle) {
		this.rotation = this.rotation + angle;
	}

	@Override
	public abstract void paint(Graphics g);

}