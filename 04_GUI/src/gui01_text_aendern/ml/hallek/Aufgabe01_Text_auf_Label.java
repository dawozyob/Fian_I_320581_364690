package gui01_text_aendern.ml.hallek;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aufgabe01_Text_auf_Label {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Beispiel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		panel.setBackground(Color.red);

		JButton btn = new JButton();
		JButton btn2 = new JButton();
		btn.setText("Button 1");
		btn2.setText("Button 2");

		JLabel label = new JLabel();

		label.setOpaque(true);

		label.setBackground(Color.white);

		panel.add(label);
		panel.add(btn);
		panel.add(btn2);

		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				label.setText(btn.getText());

			}
		};
		ActionListener al2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				label.setText(btn2.getText());

			}
		};

		btn.addActionListener(al);
		btn2.addActionListener(al2);
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
}
