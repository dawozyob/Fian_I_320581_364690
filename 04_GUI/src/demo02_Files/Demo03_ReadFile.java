package demo02_Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo03_ReadFile {
	public static void main(String[] args) {
		demoBufferedReader();
	}

	private static void demoBufferedReader() {
		File f = new File("DemoPrintWriter.txt");
		StringBuilder sb = new StringBuilder();
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while(br.ready()) {
				sb.append(br.readLine() + "\n");
			}
			System.out.println(sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
