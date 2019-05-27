package ch11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	Container contentPane;
	
	CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		ImageIcon cherryIcon = new ImageIcon("img/ch1.jpg");
		ImageIcon selectCherryIcon = new ImageIcon("img/ch2.jpg");

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectCherryIcon);
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		
		setSize(250, 250);
		setVisible(true);
	}
	
		
	public static void main(String[] args) {
		new CheckBoxEx();

	}

}
