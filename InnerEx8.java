package ch7;

import java.awt.*;
import java.awt.event.*;

public class InnerEx8 {

	public static void main(String[] args) {

		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {	// 클래스의 정의와 생성을 동시에
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		}	// 익명 클래스의 끝
		);
	}	// main의 끝
}	// InnerEx8의 끝