package gui01_text_aendern.ml.szyska;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameView extends JPanel {
	private JLabel label;
	private JButton btn;
	private JButton btn2;

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JButton getBtn() {
		return btn;
	}

	public void setBtn(JButton btn) {
		this.btn = btn;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public GameView() {
		this.setLabel(new JLabel("Ein Text"));
		this.setBtn(new JButton("Button 1"));
		this.getBtn().setActionCommand("ActionCommand Button 1");
		this.setBtn2(new JButton("Button 2"));
		this.getBtn2().setActionCommand("ActionCommand Button 2");

		this.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		this.add(this.getLabel());
		this.add(this.getBtn());
		this.add(this.getBtn2());

		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(((JButton)e.getSource()).getActionCommand());
//				Object source = e.getSource();
//				JButton source2 = (JButton) source;
//				switch (source2.getActionCommand()) {
				switch (((JButton)e.getSource()).getActionCommand()) {
				case "ActionCommand Button 1":
					method01();
					break;
				case "ActionCommand Button 2":
					method02();
					break;
				}

			}
		};
		this.getBtn().addActionListener(al);
		this.getBtn2().addActionListener(al);
	}

	public static void method01() {
		System.out.println("Button 1 gedrueckt");
	}

	public static void method02() {
		System.out.println("Button 2 gedrueckt");
	}

}
