package demo01_gui.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Demo14JComboBox {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		frame.setTitle("Demo14JComboBox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		
		String[] strings = {"erster String", "zweiter String", "dritter String"};
		
		JComboBox<String> cb = new JComboBox<>(strings);
		cb.setFont(new Font("Arial", Font.PLAIN, 20));
		cb.addItem("vierter String");
		cb.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> source = (JComboBox<String>)e.getSource();
				String item = (String)source.getSelectedItem();
				System.out.println(item);
			}
		});
		
		panel.add(cb);
		
		frame.setVisible(true);
	}
}
