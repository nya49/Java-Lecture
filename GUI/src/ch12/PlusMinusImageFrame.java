package ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlusMinusImageFrame extends JFrame{
	
	PlusMinusImageFrame(){
		setTitle("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
		getContentPane().requestFocus();
	}
	
	class MyPanel extends JPanel{
		ImageIcon imageIcon = new ImageIcon("img/img1.png");
		Image image = imageIcon.getImage();
		int width;
		int height;
		
		public MyPanel() {
			width = image.getWidth(this);
			height = image.getWidth(this);
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						width = (int)(width*1.1);
						height = (int)(height*1.1);
						repaint();
					}
					else if(e.getKeyChar() == '-') {
						width = (int)(width*0.9);
						height = (int)(height*0.9);
						repaint();
					}
				}
			
			});
		}
		

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 10, 10, width, height, this);
		}
	}
	
	public static void main(String[] args) {
		new PlusMinusImageFrame();
	}
}
