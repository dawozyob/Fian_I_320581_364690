package demo01_gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo06JCheckBox {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo06JCheckBox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);

		/*
		 * An implementation of a check box -- an item that can be selected
		 * or deselected, and which displays its state to the user.By convention, any
		 * number of check boxes in a group can be selected.
		 */
		JCheckBox box = new JCheckBox("Box 1");
		JCheckBox box2 = new JCheckBox("Box 2");
		JCheckBox box5 = new JCheckBox("Box 5");
		JCheckBox[] boxen = {box, box2, box5};
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int boxcount = 0;
				for (int i = 0; i < boxen.length; i++) {						
					if(boxen[i].isSelected()) {
						boxcount++;
						if(boxcount>2) {
							((JCheckBox)e.getSource()).setSelected(false);							
						}
					}
				}
			}
		};
		for(JCheckBox c : boxen) {
			c.addActionListener(al);
		}
		
		JCheckBox box3 = new JCheckBox("Group 1");
		JCheckBox box4 = new JCheckBox("Group 2");
		ButtonGroup bg = new ButtonGroup();
		bg.add(box3);
		bg.add(box4);
		
		JButton btn = new JButton("Check die Boxen");
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(box.isSelected()) {
					System.out.println(box.getText());
				}
				if(box2.isSelected()) {
					System.out.println(box2.getText());
				}
				if(box3.isSelected()) {
					System.out.println(box3.getText());
				}
				if(box4.isSelected()) {
					System.out.println(box4.getText());
				}
			}
		});
		
		panel.add(box);
		panel.add(box2);
		panel.add(box5);
		panel.add(box3);
		panel.add(box4);
		panel.add(btn);
		frame.setVisible(true);
	}
}
