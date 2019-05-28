package ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Sinhodeung extends JFrame{
	
	Sinhodeung(){
		add(new MyPanel());
		setSize(300, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel implements ActionListener{
		boolean flag = false;
		private int light_number = 0;
		
		public MyPanel() {
			setLayout(new BorderLayout());
			JButton b = new JButton("traffic light turn on");
			b.addActionListener(this);
			add(b, BorderLayout.SOUTH);
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawOval(100, 100, 100, 100);
			g.drawOval(100, 200, 100, 100);
			g.drawOval(100, 300, 100, 100);
			if(light_number == 0) {
				g.setColor(Color.red);
				g.fillOval(100, 100, 100, 100);
			} else if(light_number == 1) {
				g.setColor(Color.GREEN);
				g.fillOval(100, 200, 100, 100);
			} else {
				g.setColor(Color.YELLOW);
				g.fillOval(100, 300, 100, 100);
			}
		}

		public void actionPerformed(ActionEvent e) {
			if(++light_number >= 3)
				light_number = 0;
			repaint();
		}
	}
	
	public static void main(String[] args) {
		new Sinhodeung();
	}
}
