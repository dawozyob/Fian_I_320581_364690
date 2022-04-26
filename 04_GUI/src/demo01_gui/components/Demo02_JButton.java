package demo01_gui.components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo02_JButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo02_JButton");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		panel.setBackground(Color.blue);
		/*
		 * An implementation of a "push" button.
		 */
		//Button Objekt erstellen und Beschriftung festlegen
		JButton btn = new JButton("Hier Beschriftung einfuegen");
		//Text auf dem Button aendern
		btn.setText("Oder so");

		JButton btn2 = new JButton("Hier soll was passieren");
		
		//ActionListener fuer den Button erstellen
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Der Actionlistener reagiert auf den Klick des Buttons");
			}
		};
		ActionListener al2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Zweiter Actionlistener reagiert auf den Klick des Buttons");
			}
		};
		//Den/die Actionlistener auf den Buttons registrieren
		btn2.addActionListener(al);
		btn2.addActionListener(al2);
		btn.addActionListener(al);
		
		//Dem Panel die Buttons hinzufuegen
		panel.add(btn);
		panel.add(btn2);
		
		frame.setContentPane(panel);
		frame.setVisible(true);

	}
}
