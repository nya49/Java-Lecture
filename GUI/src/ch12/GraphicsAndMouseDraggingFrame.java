package ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsAndMouseDraggingFrame extends JFrame{
	
	GraphicsAndMouseDraggingFrame(){
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon imageIcon = new ImageIcon("img/img1.png");
		Image image = imageIcon.getImage();
		int ovalX = 100, ovalY=100;
		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, 20, 20);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsAndMouseDraggingFrame();
	}
}
