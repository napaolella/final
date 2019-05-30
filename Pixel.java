
public class Pixel {
	
	public static int getColor(double val)
	{
		int p;
		
		if (val < 2)
		{
			p = (255<<24) | (0<<16) | (0<<8) | 0;
			return p;
		}
		
		else if (val < 3)
		{
			
			p = (255<<24) | (128<<16) | (0<<8) | 128;
			return p;
			
		}
		
		else if (val < 5)
		{
			
			p = (255<<24) | (0<<16) | (0<<8) | 255;
			return p;
			
		}
		
		else if (val < 8)
		{
			
			p = (255<<24) | (255<<16) | (0<<8) | 0;
			return p;
			
		}
		
		else if (val < 188)
		{
			
			p = (255<<24) | (255<<16) | (255<<8) | 0;
			return p;
			
		}
		
		else
		{
			p = (0<<24) | (0<<16) | (0<<8) | 0;
			return p;
		}
	}


}
