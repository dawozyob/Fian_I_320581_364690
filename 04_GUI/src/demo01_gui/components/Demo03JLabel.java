package demo01_gui.components;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Demo03JLabel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo03JLabel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		panel.setBackground(Color.blue);
		frame.setContentPane(panel);

		/*
		 * A display area for a short text string or an image,or both.A label does not
		 * react to input events.As a result, it cannot get the keyboard focus.A label
		 * can, however, display a keyboard alternativeas a convenience for a nearby
		 * component that has a keyboard alternative but can't display it.
		 */
		JLabel label = new JLabel("Der Text des Labels");
		label.setBackground(Color.red);
		/*
		 * If true the component paints every pixel within its bounds.Otherwise, the
		 * component may not paint some or all of its pixels, allowing the underlying
		 * pixels to show through.
		 */
		label.setOpaque(true);

		panel.add(label);
		frame.setVisible(true);
	}
}
