package demo01_gui.mvc;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainView extends JFrame{
	
	private JPanel mainPanel;
	private JPanel centerPanel;
	private JLabel zahlenLabel;
	private JPanel southPanel;
	private JButton btnCountUp, btnCountDown;
	
	public MainView() {
		this.setTitle("MVC");
		this.setBounds(300, 200, 800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setMainPanel(new JPanel());
		this.setCenterPanel(new JPanel());
		this.setZahlenLabel(new JLabel());
		this.setSouthPanel(new JPanel());
		
		this.getMainPanel().setLayout(new BorderLayout());
		
		this.setBtnCountUp(new JButton("UP"));
		this.setBtnCountDown(new JButton("DOWN"));
		this.getBtnCountUp().setActionCommand("UP");
		this.getBtnCountDown().setActionCommand("DOWN");
		
		this.getSouthPanel().add(this.getBtnCountDown());
		this.getSouthPanel().add(this.getBtnCountUp());
		
		this.getZahlenLabel().setFont(new Font("Arial", Font.PLAIN, 30));
		this.getZahlenLabel().setText("Hier kommt eine Zahl rein");
		this.getZahlenLabel().setHorizontalAlignment(SwingConstants.CENTER);
		this.getZahlenLabel().setVerticalAlignment(SwingConstants.CENTER);
		
		this.getCenterPanel().add(this.getZahlenLabel());
		this.getMainPanel().add(this.getCenterPanel(), BorderLayout.CENTER);
		this.getMainPanel().add(this.getSouthPanel(), BorderLayout.SOUTH);		
		
		this.setContentPane(this.getMainPanel());
		this.setVisible(true);
	}

	public void updateZahlenLabel(int wert) {
		this.getZahlenLabel().setText("" + wert);
	}
	
	
	public JPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(JPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

	public JPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(JPanel centerPanel) {
		this.centerPanel = centerPanel;
	}

	public JLabel getZahlenLabel() {
		return zahlenLabel;
	}

	public void setZahlenLabel(JLabel zahlenLabel) {
		this.zahlenLabel = zahlenLabel;
	}

	public JPanel getSouthPanel() {
		return southPanel;
	}

	public void setSouthPanel(JPanel southPanel) {
		this.southPanel = southPanel;
	}

	public JButton getBtnCountUp() {
		return btnCountUp;
	}

	public void setBtnCountUp(JButton btnCountUp) {
		this.btnCountUp = btnCountUp;
	}

	public JButton getBtnCountDown() {
		return btnCountDown;
	}

	public void setBtnCountDown(JButton btnCountDown) {
		this.btnCountDown = btnCountDown;
	}
	
	
}
