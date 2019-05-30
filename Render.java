import java.awt.image.BufferedImage;

public class Render {
	
	public static void update(BufferedImage img)
	{
		double xVal = Display.X_LOC;
		double yVal = Display.Y_LOC;
		double inc = (3.5*Display.ZOOM_FACTOR)/img.getWidth();
				
		if (Display.STYLE == 'd')
		{
			for (int y = 0; y<img.getHeight(); y++)
			{
				xVal = Display.X_LOC;
				for (int x = 0; x<img.getWidth(); x++)
				{
					img.setRGB(x, y, Pixel.getColor(Evaluate.test(xVal, yVal)));
					xVal += inc;
				}
				
				yVal -= inc;
				
			}
			return; 
		}
		return;
	}

}
