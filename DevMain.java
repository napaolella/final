import java.io.File; 
import java.io.IOException;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField; 

public class DevMain {
	public static void main(String[] args)
	{
		Display d;
		JFrame hello = new JFrame();
		hello.setSize(300,150);
		hello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hello.setResizable(false);
		hello.setLocationRelativeTo(null);
		JLabel instructions = new JLabel("Input desired window size (default 720x480):");
		JTextField width = new JTextField("720");
		JTextField height = new JTextField("480");
		JLabel x = new JLabel("X");
		JLabel author = new JLabel("Created by Nathan Paolella 2018");
		JButton start = new JButton("Start");
		hello.setLayout(new FlowLayout());
		hello.getContentPane().add(instructions);
		hello.getContentPane().add(width);
		hello.getContentPane().add(x);
		hello.getContentPane().add(height);
		hello.add(start);
		hello.add(author);
		
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try {
					Integer.parseInt(width.getText());
					Integer.parseInt(height.getText());
				}
				catch(NumberFormatException n) {
					return;
				}
				
				if(Integer.parseInt(width.getText())<=0 || Integer.parseInt(height.getText())<=0) return;
				
				new Display(Integer.parseInt(width.getText()),Integer.parseInt(height.getText()));
				new Controller();
				hello.setVisible(false);
			}
		});
		
		hello.setVisible(true);
	
		//BufferedImage pic = null;
		//File f = null;
		/**
		try
        { 
            f = new File("C:\\Users\\Nathan\\desktop\\fractal.png"); 
            pic = ImageIO.read(f); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
		*/
		//  ImageIO.write(pic, "png", f); 
		
	}
	

}
