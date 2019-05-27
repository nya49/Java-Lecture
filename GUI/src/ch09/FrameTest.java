package ch09;

import javax.swing.*;

public class FrameTest extends JFrame {

	public FrameTest() {
		setTitle("창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 500);		// 화면 크기
		setLocation(200, 300);	// 화면 위치
		setResizable(false);		// 화면 크기 조절X
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrameTest();
		
	}

}
