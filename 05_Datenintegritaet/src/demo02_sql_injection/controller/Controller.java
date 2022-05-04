package demo02_sql_injection.controller;

import java.awt.event.ActionEvent;

import demo02_sql_injection.model.Model;
import demo02_sql_injection.view.MainFrame;

public class Controller {
	private MainFrame mainFrame;
	private Model model;
	
	public MainFrame getMainFrame() {
		return mainFrame;
	}
	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	
	public Controller() {
		this.setMainFrame(new MainFrame());
		this.setModel(new Model());
		
		this.getMainFrame().addActionListenerToInSecureButton(this::pressedInsecureButton);
		this.getMainFrame().addActionListenerToSecureButton(this::pressedSecureButton);
	}
	
	private void pressedInsecureButton(ActionEvent e) {
		String[] data = this.getMainFrame().getUserData();
		this.getModel().getCon().loginInSecure(data);
	}
	
	private void pressedSecureButton(ActionEvent e) {
		this.getModel().getCon().loginSecure(this.getMainFrame().getUserData());
	}
	
	
}
