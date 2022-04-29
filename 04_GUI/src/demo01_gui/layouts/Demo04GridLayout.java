package demo01_gui.layouts;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo04GridLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo04GridLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		for (int i = 0; i < 13; i++) {
			panel.add(new JButton("Button"));
		}
		
		
		
		frame.setVisible(true);
	}
}
