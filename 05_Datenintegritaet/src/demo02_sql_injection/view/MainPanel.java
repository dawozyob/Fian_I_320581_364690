package demo02_sql_injection.view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel {
	private JTextField nameField;
	private JTextField passField;
	private JButton loginBtnSQLInjection;
	private JButton loginSecure;
	
	public JTextField getNameField() {
		return nameField;
	}
	public void setNameField(JTextField nameField) {
		this.nameField = nameField;
	}
	public JTextField getPassField() {
		return passField;
	}
	public void setPassField(JTextField passField) {
		this.passField = passField;
	}
	public JButton getLoginBtnSQLInjection() {
		return loginBtnSQLInjection;
	}
	public void setLoginBtnSQLInjection(JButton loginBtnSQLInjection) {
		this.loginBtnSQLInjection = loginBtnSQLInjection;
	}
	public JButton getLoginSecure() {
		return loginSecure;
	}
	public void setLoginSecure(JButton loginSecure) {
		this.loginSecure = loginSecure;
	}
	
	public MainPanel() {
		this.setNameField(new JTextField(100));
		this.setPassField(new JTextField(100));
		this.setLoginBtnSQLInjection(new JButton("DANGER!"));
		this.setLoginSecure(new JButton("Secure"));
		
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		Font f = new Font("Arial", Font.BOLD, 30);
		this.getNameField().setBounds(100, 200, 250, 40);
		this.getNameField().setFont(f);
		this.getPassField().setBounds(400,200,250,40);
		this.getPassField().setFont(f);
		
		this.getLoginBtnSQLInjection().setBounds(100, 250, 150, 30);
		this.getLoginSecure().setBounds(300, 250, 150, 30);
		
		this.add(this.getNameField());
		this.add(this.getPassField());
		this.add(this.getLoginBtnSQLInjection());
		this.add(this.getLoginSecure());		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font f = new Font("Arial", Font.BOLD, 30);
		g.setFont(f);
		g.drawString("Name", 100, 190);
		g.drawString("Passwort", 400, 190);
	}
	public void addActionListenerToInSecureButton(ActionListener al) {
		this.getLoginBtnSQLInjection().addActionListener(al);		
	}
	public void addActionListenerToSecureButton(ActionListener al) {
		this.getLoginSecure().addActionListener(al);
	}
	public String[] getUserData() {
		String[] data = {this.getNameField().getText(), this.getPassField().getText()};
		return data;
	}
	
	
}
