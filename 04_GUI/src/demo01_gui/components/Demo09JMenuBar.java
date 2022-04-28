package demo01_gui.components;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

public class Demo09JMenuBar {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Demo09JMenuBar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);
		
		JMenu datei = new JMenu("Datei");
		datei.setFont(new Font("Arial", Font.PLAIN, 15));
		bar.add(datei);
		
		JMenuItem laden = new JMenuItem("Laden");
		datei.add(laden);
		
		JMenuItem speichern = new JMenuItem("Speichern");
		datei.add(speichern);
		
		JSeparator sep = new JSeparator();
		datei.add(sep);
		
		JMenuItem beenden = new JMenuItem("Beenden");
		datei.add(beenden);
		
		JMenu edit = new JMenu("Edit");
		bar.add(edit);
		
		JMenuItem font = new JMenuItem("Font");
		edit.add(font);
		
		JMenu schriftGroesse = new JMenu("Schriftgroesse");
		edit.add(schriftGroesse);
		
		JMenuItem groesser = new JMenuItem("Groesser");
		schriftGroesse.add(groesser);
		
		JMenuItem kleiner = new JMenuItem("Kleiner");
		schriftGroesse.add(kleiner);
		
		JMenu chk = new JMenu("Checkboxen");
		bar.add(chk);
		
		JCheckBoxMenuItem checkbox = new JCheckBoxMenuItem("Eine Checkbox");
		chk.add(checkbox);
		
		JRadioButtonMenuItem radiobtn = new JRadioButtonMenuItem("Ein Radiobutton");
		chk.add(radiobtn);
		
		
		frame.setVisible(true);
	}
}
