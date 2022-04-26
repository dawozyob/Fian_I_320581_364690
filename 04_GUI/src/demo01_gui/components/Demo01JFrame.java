package demo01_gui.components;

import javax.swing.JFrame;

public class Demo01JFrame {
	public static void main(String[] args) {
		//Der Frame ist der Rahmen der GUI
		//Im Frame werden alle Elemente plaziert
		JFrame frame = new JFrame();
		
		//Titel setzen
		frame.setTitle("Demo01JFrame");
		
		frame.setDefaultCloseOperation(0);
		//Groesse festlegen
		frame.setBounds(400, 300, 800, 600);
		
		
		frame.setVisible(true);
	}
}
