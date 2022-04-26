package demo01_gui.components;

import java.awt.Color;

import javax.swing.JFrame;

public class Demo01JFrame {
	public static void main(String[] args) {
		//Der Frame ist der Rahmen der GUI
		//Im Frame werden alle Elemente plaziert
		JFrame frame = new JFrame();
		
		//Titel setzen
		frame.setTitle("Demo01JFrame");
		//Das Programm soll beim Schliessen des Fensters beendet werden
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Groesse festlegen
		frame.setBounds(400, 300, 800, 600);
		
		//Alle Komponenten werden im ContentPane plaziert
		frame.getContentPane().setBackground(Color.blue);
		
		//Das Frame sichtbar machen
		//Sollte immer als letztes passieren,
		//damit alles sauber gezeichnet wird.
		frame.setVisible(true);
	}
}
