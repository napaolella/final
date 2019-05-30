import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Display {
	
	private static JFrame j;
	private static int height;
	private static int width;
	public static char STYLE;
	
	private static BufferedImage i;
	private static JLabel l;
	
	public static int ITS;
	public static double ZOOM_FACTOR;
	public static double X_LOC;
	public static double Y_LOC;
	
	public Display(int x, int y)
	{
		height = y;
		width = x;
		STYLE = 'd';
		ZOOM_FACTOR = 1;
		X_LOC = -2.5;
		Y_LOC = 1;
		ITS = 15;
		j = new JFrame("Viewer");
		j.setSize(x, y);
		i = new BufferedImage(x-20,y-40,BufferedImage.TYPE_INT_ARGB);
		Render.update(i);
		l = new JLabel(new ImageIcon(i));
		j.add(l);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setResizable(false);
		j.setLocationRelativeTo(null);
		j.setVisible(true);	
	}
	
	public static void refresh()
	{
		j.remove(l);
		Render.update(i);
		l = new JLabel(new ImageIcon(i));
		j.add(l);
		j.setVisible(true);
	}
	
	public static void moveRight() {
		X_LOC += 3.5*ZOOM_FACTOR*0.3;
	}
	
	public static void moveLeft() {
		X_LOC -= 3.5*ZOOM_FACTOR*0.3;
	}
	
	public static void moveUp() {
		Y_LOC += 3.5*ZOOM_FACTOR*0.3;
	}
	
	public static void moveDown() {
		Y_LOC -= 3.5*ZOOM_FACTOR*0.3;
	}
	
	public static void zoom() {
		X_LOC += 0.3*3.5*ZOOM_FACTOR;
		Y_LOC -= 0.3*3.5*ZOOM_FACTOR;
		ZOOM_FACTOR *= 0.6;
	}
	
	public static void unZoom() {
		X_LOC -= 0.5*3.5*ZOOM_FACTOR;
		Y_LOC += 0.5*3.5*ZOOM_FACTOR;
		ZOOM_FACTOR *= 1.67;
	}
	
}
