package demo01_gui.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Demo12JTextArea {
	public static void main(String[] args) {
		demo02();
	}

	private static void demo02() {
		JFrame frame = new JFrame();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		frame.setTitle("Demo12JTextArea");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		frame.setContentPane(panel);
		Font f = new Font("Arial", Font.PLAIN, 20);

		// A JTextArea is a multi-line area that displays plain text.
		JTextArea txtArea = new JTextArea();
		txtArea.setFont(f);
//		txtArea.setEditable(false);
		txtArea.setText(
				"Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, \r\n"
						+ "sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est \r\n"
						+ "Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et \r\n"
						+ "dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea \r\n"
						+ "takimata sanctus est Lorem ipsum dolor sit amet.");

		/*
		 * Provides a scrollable view of a lightweight component.A JScrollPane manages a
		 * viewport, optional vertical and horizontal scroll bars, and optional row
		 * and column heading viewports.
		 */
		JScrollPane spane = new JScrollPane();
		spane.setViewportView(txtArea);

		panel.add(spane);
		frame.setVisible(true);

	}

	public static void demo01() {
		JFrame frame = new JFrame();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		frame.setTitle("Demo12JTextArea");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		Font f = new Font("Arial", Font.PLAIN, 20);

		// A JTextArea is a multi-line area that displays plain text.
		JTextArea txtArea = new JTextArea();
		txtArea.setFont(f);
//		txtArea.setEditable(false);
		txtArea.setText("Dies ist eine TextArea");

		panel.add(txtArea);
		frame.setVisible(true);
	}
}
