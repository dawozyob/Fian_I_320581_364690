package demo01_gui.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	
	private MainView mainView;
	private Model model;
	
	public Controller() {
		this.setMainView(new MainView());
		this.setModel(new Model());
		this.getMainView().getBtnCountUp().addActionListener(this);
		this.getMainView().getBtnCountDown().addActionListener(this);
	}

	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "UP":
			this.getMainView().updateZahlenLabel(this.getModel().countUp());
			break;
		case "DOWN":
			this.getMainView().updateZahlenLabel(this.getModel().countDown());
			break;
		}
		
	}
	
	
}
