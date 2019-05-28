package ch11;

import javax.swing.*;

import ch11.TextAreaEx.MyCenterPanel;

import java.awt.*;
import java.awt.event.*;




public class TextAreaEx2 extends JFrame{
	Container contentPane;
	
	public static void main(String[] args) {
		new TextAreaEx2();

	}
	
	TextAreaEx2(){
		setTitle("텍스트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyPanel());
		setSize(300, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		String[] text = {"오만원", "만원", "천원", "오백원", "백원", "오십원", "십원", "1원"};
		JTextField source;
		JTextField[] tf = new JTextField[8];
		
		MyPanel() {
			JLabel la = new JLabel("금액");
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(20, 20);
			add(la);
			
			source = new JTextField(30);
			source.setSize(100, 20);
			source.setLocation(100, 20);
			add(source);
			
			JButton calcBtn = new JButton("계산");
			calcBtn.setSize(70, 20);
			calcBtn.setLocation(210, 20);
			add(calcBtn);
			
			for(int i=0; i<text.length; i++) {
				la = new JLabel(text[i]);
				la.setHorizontalAlignment(JLabel.RIGHT);
				la.setSize(50, 30);
				la.setLocation(50, 50+i*20);
				add(la);
				tf[i] = new JTextField(30);
				tf[i].setHorizontalAlignment(JTextField.CENTER);
				tf[i].setSize(70, 20);
				tf[i].setLocation(120, 50+i*20);
				
				add(tf[i]);
			}
			
			calcBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String str = source.getText();
					if(str.length() == 0) return;
					
					int money = Integer.parseInt(str);
					int res;
					for(int i=0; i<unit.length; i++) {
						res = money/unit[i];
						tf[i].setText(Integer.toString(res));
						if(res > 0) money = money%unit[i];
					}
				}
			});
		}
	}
}
