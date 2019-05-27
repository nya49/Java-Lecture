package ch11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
	Container contentPane;
	
	ButtonImageEx() {
		setTitle("버튼에 아이콘 달기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		ImageIcon normalIcon = new ImageIcon("img/ph.png");
		ImageIcon rolloverIcon = new ImageIcon("img/ph2.png");
		ImageIcon pressedIcon = new ImageIcon("img/ph3.png");

		JButton btn = new JButton("call~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);
		
		setSize(250, 200);
		setVisible(true);
	}
	
		
	public static void main(String[] args) {
		new ButtonImageEx();

	}

}
