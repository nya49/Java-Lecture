package ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class GraphicsDrawImageEx1 extends JFrame{
	Container contentPane;
	
	GraphicsDrawImageEx1(){
		setTitle("DrawImage 사용 예제1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(400, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon imageIcon = new ImageIcon("img/img1.png");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20, 20, this);
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();
	}
}
