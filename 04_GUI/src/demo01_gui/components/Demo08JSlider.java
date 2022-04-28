package demo01_gui.components;

import java.awt.FlowLayout;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Demo08JSlider {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo08JSlider");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);

		/*
		 * A component that lets the user graphically select a value by sliding a knob
		 * within a bounded interval. The knob is always positioned at the points that
		 * match integer values within the specified interval.
		 */
		JSlider slider = new JSlider(SwingConstants.VERTICAL);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setMinimum(20);
		slider.setMaximum(50);
		
		slider.addChangeListener(new ChangeListener() {			
			@Override
			public void stateChanged(ChangeEvent e) {
				Object src = e.getSource();
				JSlider s = (JSlider)src;
				System.out.println("Value: " + s.getValue());
			}
		});
		
		JSlider slider2 = new JSlider(SwingConstants.VERTICAL);
		//LabelTable erstellen
		Hashtable<Integer, JLabel> labelTable = new Hashtable<>();
		labelTable.put(0, new JLabel("Stop"));
		labelTable.put(50, new JLabel("Mittel"));
		labelTable.put(100, new JLabel("Schnell"));
		//Dem Slider die Tabelle hinzufuegen
		slider2.setLabelTable(labelTable);
		//Die Label sollen gemalt werden
		slider2.setPaintLabels(true);
		
		panel.add(slider);
		panel.add(slider2);
		frame.setVisible(true);
	}
}
