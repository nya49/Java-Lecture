package ch11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SliderEx extends JFrame {
	Container contentPane;
	
	SliderEx() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		contentPane.add(slider);
		setSize(250,200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new SliderEx();

	}

}
