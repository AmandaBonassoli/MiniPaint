package aulaOka;

import java.awt.Component;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class MouseRetangulo extends Component {


	private static final long serialVersionUID = 1L;

	ArrayList<Shape> shapes = new ArrayList<Shape>();

	Point startDrag, endDrag;

	public MouseRetangulo() {
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				startDrag = new Point(e.getX(), e.getY());
				endDrag = startDrag;
				repaint();
			}

			public void mouseReleased(MouseEvent e) {
				
					Shape r = makeRectangle(startDrag.x, startDrag.y, e.getX(), e.getY());
					shapes.add(r);
					startDrag = null;
					endDrag = null;
				
				repaint();
			}
		});

		this.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				endDrag = new Point(e.getX(), e.getY());
				repaint();
			}
		});
	}

	private void paintBackground(Graphics2D g2) {
		g2.setPaint(Color.GRAY);
		for (int i = 0; i < getSize().width; i += 10) {
			Shape line = new Line2D.Float(i, 0, i, getSize().height);
			g2.draw(line);
		}

		for (int i = 0; i < getSize().height; i += 10) {
			Shape line = new Line2D.Float(0, i, getSize().width, i);
			g2.draw(line);
		}

	}

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		paintBackground(g2);
		Color[] colors = {new Color(255, 255, 255), new Color(255, 160, 122), new Color(255, 20, 147), new Color(255, 0, 0),
				new Color(255, 165, 0), new Color(255, 255, 0), new Color(0, 255, 0), new Color(0, 100, 0), new Color(0, 245, 255),
				new Color(0, 0, 255), new Color(85, 26, 139), new Color(139, 0, 139), new Color(205, 155, 129), new Color(139, 69, 19),
				new Color(139, 139, 122), new Color(0, 0, 0)};
		int colorIndex = 0;

		g2.setStroke(new BasicStroke(2));
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.50f));

		for (Shape s : shapes) {
			g2.setPaint(Color.BLACK);
			g2.draw(s);
			g2.setPaint(colors[(colorIndex++) % 16]);
			g2.fill(s);
		}

		if (startDrag != null && endDrag != null) {
			g2.setPaint(Color.GRAY);
			Shape r = makeRectangle(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
			g2.draw(r);
		}
	}

	private Rectangle2D.Float makeRectangle(int x1, int y1, int x2, int y2) {
		return new Rectangle2D.Float(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));

	} 

}
