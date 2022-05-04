package demo02_sql_injection.view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private MainPanel mainPanel;

	public MainPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	
	public MainFrame() {
		this.setMainPanel(new MainPanel());
		this.setBounds(300, 200, 800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(this.getMainPanel());
		this.setVisible(true);
	}

	public void addActionListenerToInSecureButton(ActionListener al) {
		this.getMainPanel().addActionListenerToInSecureButton(al);
	}

	public void addActionListenerToSecureButton(ActionListener al) {
		this.getMainPanel().addActionListenerToSecureButton(al);		
	}

	public String[] getUserData() {		
		return this.getMainPanel().getUserData();
	}
}
