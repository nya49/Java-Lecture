package ch09;

import javax.swing.*;
import java.awt.*;


public class ContentPaneEx extends JFrame{
	
	ContentPaneEx(){
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Igonre"));
		contentPane.add(new JButton("Add"));
		contentPane.add(new JButton("Sub"));
		
		
		setSize(350, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
