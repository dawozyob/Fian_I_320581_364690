package gui01_text_aendern.ml.marek;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aufgabe01_Text_auf_Label {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Hausaufgabe 27.04.2022");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);

		JPanel panel = new JPanel();
		frame.setContentPane(panel);

		panel.setBackground(Color.black);

		JLabel label = new JLabel("Hallo Hausaufgabe");
		label.setOpaque(true);
		frame.add(label);

		JButton btn = new JButton("Pause");

		JButton btn2 = new JButton("Weiter");

		ActionListener a1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Du hast den Pause Button geklickt");
				label.setText("Pause");

			}

		};

		ActionListener a2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Du hast den Weiter Button geklickt");
				label.setText("Weiter");
			}

		};
		// sd

		btn.addActionListener(a1);
		btn2.addActionListener(a2);

		panel.add(btn);
		panel.add(btn2);

		frame.setVisible(true);
	}
}
