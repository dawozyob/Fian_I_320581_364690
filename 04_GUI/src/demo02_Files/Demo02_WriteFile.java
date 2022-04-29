package demo02_Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo02_WriteFile {
	public static void main(String[] args) {
//		demoBufferedWriter();
		demoPrintWriter();
	}

	private static void demoPrintWriter() {
		File f = new File("DemoPrintWriter.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.println("erste Zeile");
			pw.println("zweite Zeile");
			pw.println("dritte Zeile");
			pw.append("vierte Zeile\n");
			pw.flush();
			pw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private static void demoBufferedWriter() {
		File file = new File("DemoBufferedWriter.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			/*
			 * zweiter Parameter beim FileWriter auf true für append
			 * 
			 * Buffered Writer hat newLine() und bessere Performance
			 * 
			 * Der FileWriter wird benutzt um character files zu schreiben. Seine write()
			 * Methode erlaubt es charaters oder Strings in eine Datei zu schreiben.
			 * Üblicherweise packt man FileWriter Objekte in Objekte von höheren Writer
			 * Klassen ein, welche höhre Performance und flexiblere Methoden bieten um Daten
			 * zu schreiben.
			 * 
			 * Der Buffered Writer wird genutzt um z.B. FileWriter effizienter und einfacher
			 * nutzbar zu machen. Verglichen mit FileWritern schreiben BufferedWriter
			 * größere Mengen auf einmal.
			 */

			FileWriter fw = new FileWriter(file, true);
			fw.write("");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("erste Zeile ");
			bw.newLine();
			bw.write("zweite Zeile");
			bw.newLine();
			bw.write("dritte Zeile " + System.lineSeparator() + "vierte Zeile");
			bw.append("\nappend");
			/*
			 * flush() spuelt den Buffer des BufferedWriters in die Datei, also erst dann
			 * wird in die Datei geschrieben.
			 */
			bw.flush();

			/*
			 * Schliesst den BufferedWriter. Vorher wird noch flush() ausgefuehrt.
			 */
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
