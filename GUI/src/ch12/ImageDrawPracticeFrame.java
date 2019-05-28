package ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageDrawPracticeFrame extends JFrame{
	
	ImageDrawPracticeFrame(){
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon imageIcon = new ImageIcon("img/img1.png");
		Image image = imageIcon.getImage();
		public MyPanel() {
			setLayout(new FlowLayout());
			add(new JButton("Hello"));
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}
	
	public static void main(String[] args) {
		new ImageDrawPracticeFrame();
	}
}
