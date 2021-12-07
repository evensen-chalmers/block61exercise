import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import polygons.PolygonFactory;

/**
 * Created by Niklas on 2016-02-21.
 * Minor edits by Pelle on 2021-12-06
 */
public class PolygonController {

	private final PolygonModel model;
	private final PolygonViewer view;

	public PolygonController(PolygonModel model, PolygonViewer view) {
		this.model = model;
		this.view = view;
		initInteraction();
	}

	private void initInteraction() {
		this.view.addMouseListener(new PolygonCreator());
	}

	private class PolygonCreator implements MouseListener {
		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			Point pointClicked = e.getPoint();
			PolygonController.this.model.addPolygon(PolygonFactory.createRectangle(pointClicked.x, pointClicked.y));
			PolygonController.this.view.repaint();
		}

	}

}