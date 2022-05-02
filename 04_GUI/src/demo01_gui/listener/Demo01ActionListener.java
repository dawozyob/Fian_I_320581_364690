package demo01_gui.listener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo01ActionListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo01ActionListener");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 200, 800, 600);
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btn = new JButton("Anonymes Listener Objekt");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Anonymes Listener Objekt");
			}
		});

		JButton btn2 = new JButton("Absenden");
		MeinActionListener mal = new MeinActionListener();
		btn2.addActionListener(mal);
		btn2.setActionCommand("Absenden");

		JButton btn3 = new JButton("Abbrechen");
		btn3.addActionListener(mal);
		btn3.setActionCommand("Abbrechen");
		
		JButton btn4 = new JButton("Button 4");
		btn4.addActionListener(MeinActionListener::staticMethod);
		
		JButton btn5 = new JButton("Button 5");
		btn5.addActionListener(mal::instanceMethod);
		
		JButton btn6 = new JButton("Button 6");
		btn6.addActionListener(e->System.out.println("Lambda ActionListener"));
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		
		frame.setVisible(true);
	}
}

class MeinActionListener implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Klasse, die ActionListener implementiert");
		System.out.println(e.getActionCommand());
		switch (e.getActionCommand()) {
		case "Absenden":
			System.out.println("Daten abgesendet");
			break;
		case "Abbrechen":
			System.out.println("Abgebrochen");
			break;
		}
	}
	
	public static void staticMethod(ActionEvent e) {
		System.out.println("Daten abgesendet aus statischer Methode");
	}
	
	public void instanceMethod(ActionEvent e) {
		System.out.println("Daten abgesendet aus Instanz Methode");
	}

}

class MainFrame extends JFrame {
	private JPanel northPanel;
	private JButton btn;

	public JPanel getNorthPanel() {
		return northPanel;
	}

	public void setNorthPanel(JPanel northPanel) {
		this.northPanel = northPanel;
	}

	public JButton getBtn() {
		return btn;
	}

	public void setBtn(JButton btn) {
		this.btn = btn;
	}

	public MainFrame() {
		this.btn = new JButton();

		MainFrame frame = this;
		this.btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getNorthPanel().setBackground(Color.cyan);

			}
		});
	}

}
