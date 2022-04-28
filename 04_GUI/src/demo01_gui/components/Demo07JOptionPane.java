package demo01_gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Demo07JOptionPane {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo07JOptionPane");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);

		/*
		 * JOptionPane makes it easy to pop up a standard dialog box that prompts users
		 * for a value or informs them of something.
		 */
		JButton btn = new JButton("Texteingabe");
		JLabel label = new JLabel("Hier kommt ein Text rein");
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = JOptionPane.showInputDialog(panel, "Bitte einen Text eingeben", "Eine Frage", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(panel, "Danke fuers klicken", "Ein Titel", JOptionPane.INFORMATION_MESSAGE);			
				if(text != null) {
					System.out.println(text.length());
				}
				System.out.println(text);
				label.setText(text);
			}
		});
		
		JButton btn2 = new JButton("to Confirm");
		btn2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(panel, "Wirklich beenden?", "Ein Titel", JOptionPane.NO_OPTION);
//				System.out.println(input);
				if(input == 0) {
					System.out.println("Ja gedrueckt");
				}
				if(input == 1) {
					System.out.println("Nein gedrueckt");
				}
				if(input == 2) {
					System.out.println("Abbrechen gedrueckt");
				}
				if(input == -1) {
					System.out.println("Dialog mit x beendet");
				}
			}
		});
		JButton btn3 = new JButton("Error Message");
		btn3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "Fehler !", "Error Message", JOptionPane.ERROR_MESSAGE);
				
			}
		});
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(label);
		frame.setVisible(true);
	}
}
