package ch09;

import javax.swing.*;
import java.awt.*;


public class BorderLayoutEx extends JFrame{
	
	BorderLayoutEx(){
		setTitle("BorderLayout Simple");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container contentPane = getContentPane();
		contentPane.add(new JButton("add"), BorderLayout.NORTH);
		contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
		contentPane.add(new JButton("mul"), BorderLayout.EAST);
		contentPane.add(new JButton("div"), BorderLayout.WEST);
		contentPane.add(new JButton("calculate"), BorderLayout.CENTER);
		
		
		setSize(350, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();

	}

}
