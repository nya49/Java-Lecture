package ch11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEx2 extends JFrame {
	Container contentPane;
	JButton b;
	JCheckBox ch1, ch2;
	
	CheckBoxItemEx2() {
		setTitle("체크박스 만들기 예제2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		ch1 = new JCheckBox("버튼 비활성화");
		ch2 = new JCheckBox("버튼 감추기");
		b = new JButton("Test Button");
		ch1.addItemListener(new MyCheckBox());
		ch2.addItemListener(new MyCheckBox());
		
		
		add(ch1);
		add(ch2);
		add(b);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	class MyCheckBox implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int selected=1;
			if(e.getStateChange() == ItemEvent.SELECTED)
				selected = 1;
			else
				selected = -1;
			if(e.getItem() == ch1) 
				if(b.isEnabled())
					b.setEnabled(false);
				else
					b.setEnabled(true);
			if(e.getItem() == ch2) 
				if(b.isVisible())
					b.setVisible(false);
				else
					b.setVisible(true);
		}
	}
		
	public static void main(String[] args) {
		new CheckBoxItemEx2();

	}

}
