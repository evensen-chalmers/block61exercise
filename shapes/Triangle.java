package shapes;

/**
 * Created by Niklas on 2016-02-14.
 * Minor edits by Pelle on 2021-12-06
 */
public class Triangle extends Polygon {
	public Triangle(int x, int y, int sizeX, int sizeY, double rotation) {
		super(x, y);
		scale(sizeX, sizeY);
		rotate(rotation);
	}

	public Triangle(int x, int y, int sizeX, int sizeY) {
		super(x, y);
		scale(sizeX, sizeY);
	}

	public Triangle(int x, int y, double rotation) {
		super(x, y);
		rotate(rotation);
	}

	public Triangle(int x, int y) {
		super(x, y);
	}

	@Override
	protected int[][] getOffsets() {
		int xOffset = getScaleX() / 2;
		int yOffset = getScaleY() / 3;
		int[][] offsets = { { 0, -yOffset * 2 }, { -xOffset, yOffset }, { xOffset, yOffset } };
		return offsets;
	}
}
