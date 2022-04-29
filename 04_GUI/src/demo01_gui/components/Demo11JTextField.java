package demo01_gui.components;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Demo11JTextField {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		frame.setTitle("Demo11JTextField");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		Font f = new Font("Arial", Font.PLAIN, 20);
		/*
		 * JTextField is a lightweight component that allows the editing of a single line
		 * of text.
		 */
		JTextField txtField = new JTextField("Ein einfaches nicht editierbares Textfeld");
		txtField.setEditable(false);
		txtField.setFont(f);
		
		JTextField txtField2 = new JTextField("Ein einfaches editierbares Textfeld");
		txtField2.setFont(f);
		
		JTextField txtField3 = new JTextField("Mit int Colums", 50);
		
		JPasswordField pass = new JPasswordField("Passwort");
		pass.setFont(f);
		char echoChar = pass.getEchoChar();
		System.out.println((int)echoChar);
		
		JButton btn = new JButton("Anzeigen");
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				if(pass.getEchoChar() == echoChar) {
					pass.setEchoChar((char)0);
				}else {
					pass.setEchoChar(echoChar);
				}	
				char[] password = pass.getPassword();
				for(char c : password) {
					System.out.println(c);
				}
			}
		});
		
		JButton btn2 = new JButton("Speichern");
		btn2.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtField.getText());				
			}
		});
		
		panel.add(txtField);
		panel.add(txtField2);
		panel.add(txtField3);
		panel.add(pass);
		panel.add(btn);
		panel.add(btn2);
		frame.setVisible(true);
	}
}
