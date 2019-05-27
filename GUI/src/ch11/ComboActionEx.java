package ch11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboActionEx extends JFrame {
	Container contentPane;
	String[] fruits = {"apple", "pear", "cherry", "mango"};
	ImageIcon[] images = {
			new ImageIcon("img/apple.png"),
			new ImageIcon("img/pear.jpg"),
			new ImageIcon("img/ch1.jpg"),
			new ImageIcon("img/mango.png")
	};
	JLabel imgLabel = new JLabel(images[0]);
	
	ComboActionEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JComboBox strCombo = new JComboBox(fruits);
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}

		});
		
		contentPane.add(strCombo);
		contentPane.add(imgLabel);

		setSize(250,200);
		setVisible(true);

	}

	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == 
				ItemEvent.DESELECTED)
				return;
			if(radio[0].isSelected()) 
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected()) 
				imageLabel.setIcon(image[1]);
			else 
				imageLabel.setIcon(image[2]);
		}
	}
	
	public static void main(String[] args) {
		new ComboActionEx();

	}

}
