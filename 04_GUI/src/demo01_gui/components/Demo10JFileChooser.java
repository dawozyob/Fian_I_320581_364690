package demo01_gui.components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Demo10JFileChooser {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		frame.setTitle("Demo10JFileChooser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400, 300, 800, 600);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		frame.setContentPane(panel);
		
		
		JButton btn = new JButton("Laden");
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(new File("C:\\Unterricht\\Workspaces_Unterricht\\FIAN_I_320581_364690\\Fian_I_320581_364690\\04_GUI"));
				int ret = fc.showOpenDialog(panel);
				if(ret == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					if(f.getName().endsWith(".txt")) {
						FileReader fr;
						try {
							fr = new FileReader(f);
							BufferedReader br = new BufferedReader(fr);
							while(br.ready()) {
								System.out.println(br.readLine());
							}							
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		
		JButton btnSave = new JButton("Speichern");
		btnSave.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(new File("C:\\Unterricht\\Workspaces_Unterricht\\FIAN_I_320581_364690\\Fian_I_320581_364690\\04_GUI"));
				int ret = fc.showSaveDialog(panel);
				if(ret == JFileChooser.APPROVE_OPTION) {
					System.out.println("Datei gespeichert");
				}
			}
		});
		
		JButton btnCustom = new JButton("Custom Dialog");
		btnCustom.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setCurrentDirectory(new File("C:\\Unterricht\\Workspaces_Unterricht\\FIAN_I_320581_364690\\Fian_I_320581_364690\\04_GUI"));
				int ret = fc.showDialog(panel, "Starten oder sowas");
				if(ret == JFileChooser.APPROVE_OPTION) {
					System.out.println("Datei gestartet oder sowas");
				}
				
			}
		});
				
		panel.add(btn);
		panel.add(btnSave);
		panel.add(btnCustom);
		frame.setVisible(true);
	}
}
