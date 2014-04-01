import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Malen extends Frame implements MouseMotionListener, MouseListener,
		KeyListener, WindowListener {
	
	// Koordinaten
	int x0,y0,x1,y1;
	
	// Farbe
	char c;
	
	public Malen() {
		setSize(400,400);
		setLocation(100,100);
		setTitle("Drawing is gay.");
		setBackground(Color.LIGHT_GRAY);
		addMouseListener(this);				// Maustasten
		addMouseMotionListener(this);		// Mauskugel
		addWindowListener(this);			// für schliessen
		addKeyListener(this);				// Tastatur
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		switch (c) {
		case 'b': g.setColor(Color.BLUE); break;
		case 'r': g.setColor(Color.RED); break;
		case 'g': g.setColor(Color.GREEN); break;
		default: g.setColor(Color.BLACK);
		}
		g.drawLine(x0, y0, x1, y1);
		x0=x1;y0=y1;
	}
	
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		c = e.getKeyChar();
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x0 = e.getX();
		y0 = e.getY();		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	public static void main(String[] args) {
		new Malen();
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

}
