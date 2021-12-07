package shapes;

/**
 * Created by Niklas on 2016-02-14. Minor edits by Pelle on 2021-12-06
 */
public class Rectangle extends Polygon {

	public Rectangle(int x, int y, int sizeX, int sizeY, double rotation) {
		super(x, y);
		scale(sizeX, sizeY);
		rotate(rotation);
	}

	public Rectangle(int x, int y, int sizeX, int sizeY) {
		super(x, y);
		scale(sizeX, sizeY);
	}

	public Rectangle(int x, int y, double rotation) {
		this(x, y, 1, 1, rotation);
	}

	public Rectangle(int x, int y) {
		this(x, y, 1, 1);
	}

	@Override
	protected int[][] getOffsets() {
		int xOffset = getScaleX() / 2;
		int yOffset = getScaleY() / 2;
		int[][] offsets = { { -xOffset, -yOffset }, { xOffset, -yOffset }, { xOffset, yOffset },
				{ -xOffset, yOffset } };
		return offsets;
	}

}
