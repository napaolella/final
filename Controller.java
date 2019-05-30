import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Controller {
	
	public Controller() {
		JFrame c = new JFrame("Settings");
		JButton up = new JButton("^");
		JButton down = new JButton("v");
		JButton left = new JButton("<");
		JButton right = new JButton(">");
		JButton in = new JButton("+");
		JButton out = new JButton("-");
		JButton r = new JButton("Refresh");
		JLabel s = new JLabel("Render Style:");
		JLabel i = new JLabel("Iterations Per Pixel:");
		JTextField its = new JTextField("15",4);
		String[] styles = {"default"};
		JComboBox b = new JComboBox(styles);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setSize(220, 400);
		c.setLocationByPlatform(true);
		c.setResizable(false);
		GridBagConstraints g = new GridBagConstraints();
		c.setLayout(new GridBagLayout());
		g.gridx = 1;
		g.gridy = 0;
		c.add(up, g);
		g.gridx = 0;
		g.gridy = 1;
		c.add(left, g);
		g.gridx = 2;
		g.gridy = 1;
		c.add(right, g);
		g.gridx = 1;
		g.gridy = 2;
		c.add(down, g);
		g.gridx = 0;
		g.gridy = 4;
		g.weighty = 1;
		g.ipady = 20;
		c.add(in, g);
		g.gridx = 2;
		c.add(out, g);
		g.gridx = 1;
		g.gridy = 5;
		c.add(s, g);
		g.weighty = 0;
		g.gridx = 1;
		g.gridy = 6;
		c.add(b, g);
		g.gridy = 7;
		c.add(i, g);
		g.gridy = 8;
		c.add(its, g);
		g.gridy = 9;
		c.add(r, g);
		
		up.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Display.moveUp();
				Display.refresh();
				c.toFront();
			}
		});
		
		down.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Display.moveDown();
				Display.refresh();
				c.toFront();
			}
		});
		
		left.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Display.moveLeft();
				Display.refresh();
				c.toFront();
			}
		});
		
		right.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Display.moveRight();
				Display.refresh();
				c.toFront();
			}
		});
		
		in.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Display.zoom();
				Display.refresh();
				c.toFront();
			}
		});
		
		out.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Display.unZoom();
				Display.refresh();
				c.toFront();
			}
		});
		
		r.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
					Integer.parseInt(its.getText());
				}
				catch(NumberFormatException n) {
					return;
				}
				
				if (Integer.parseInt(its.getText())>0) {
					Display.ITS = Integer.parseInt(its.getText());
					Display.refresh();
					c.toFront();
				}
			}
		});
		
		c.setVisible(true);
	}

}
