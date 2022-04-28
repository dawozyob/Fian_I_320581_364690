package demo01_gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Demo04ToggleButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo04ToggleButton");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		/*
		 * An implementation of a two-state button.The JRadioButton and JCheckBox
		 * classes are subclasses of this class.
		 */
		JToggleButton tglbtn = new JToggleButton("Toggle Me");
		JLabel label = new JLabel("Hier kommt ein Text rein, ob der Button ein oder ausgeschaltet ist");

		tglbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tglbtn.isSelected()) {
					System.out.println("ToggleButton ist eingeschaltet");
					label.setText("              An               ");
				} else {
					System.out.println("ToggleButton ist nicht eingeschaltet");
					label.setText("              Aus              ");
				}

			}
		});

		JButton btn = new JButton("Check Toggle");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tglbtn.isSelected()) {
					System.out.println("ToggleButton ist eingeschaltet");
					label.setText("              An               ");
				} else {
					System.out.println("ToggleButton ist nicht eingeschaltet");
					label.setText("              Aus              ");
				}

			}
		});

		panel.add(tglbtn);
		panel.add(label);
		panel.add(btn);
		frame.setVisible(true);
	}
}
