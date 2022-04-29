package demo01_gui.layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo02FlowLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo02FlowLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		
		JButton btn = new JButton("Button");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		
		frame.setVisible(true);
	}
}
