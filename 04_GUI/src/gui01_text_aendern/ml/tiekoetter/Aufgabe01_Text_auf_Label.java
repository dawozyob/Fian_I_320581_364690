package gui01_text_aendern.ml.tiekoetter;

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
		frame.setTitle("Gui_003");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 350));
		panel.setBackground(Color.gray);

		JLabel label = new JLabel("Bitte Hintergrundfarbe wählen");
		label.setBackground(Color.green);

		JButton knopfS = new JButton("Standard");
		knopfS.setText("Standard");

		JButton knopf1 = new JButton("Orange");
		knopf1.setText("Orange");

		JButton knopf2 = new JButton("Schwarz");
		knopf2.setText("Schwarz");

		ActionListener standard = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Farbe wurde auf Standard zurückgesetzt");
				panel.setBackground(Color.gray);
				label.setText("Standard gewählt");
			}
		};

		ActionListener al1 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Farbe Orange wurde Ausgewählt");
				panel.setBackground(Color.orange);
				label.setText("Orange gewählt");
			}
		};

		ActionListener al2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Farbe Schwarz wurde Ausgewählt");
				panel.setBackground(Color.black);
				label.setText("Schwarz gewählt");

			}
		};

		label.setOpaque(true);
		panel.add(label);

		knopfS.addActionListener(standard);
		knopf1.addActionListener(al1);
		knopf2.addActionListener(al2);

		panel.add(knopfS);
		panel.add(knopf1);
		panel.add(knopf2);

		frame.setContentPane(panel);
		frame.setVisible(true);
	}
}
