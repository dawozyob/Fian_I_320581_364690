package demo02_Files;

import java.io.File;
import java.io.IOException;

public class Demo01_Files {
	public static void main(String[] args) {
		/*
		 * Ein File Objekt stellt eine Instanz auf eine Datei oder ein Verzeichnis dar.
		 */
		File file = new File("Readme.txt");
		File dir = new File("MeinNeuerOrdner/test");

		System.out.println("file.exists(): " + file.exists());
		System.out.println("file.isFile(): " + file.isFile());
		System.out.println("file.isDirectory(): " + file.isDirectory());
		System.out.println("-----------------------------------------");
		System.out.println("dir.exists(): " + dir.exists());
		System.out.println("dir.isFile(): " + dir.isFile());
		System.out.println("dir.isDirectory(): " + dir.isDirectory());

		/*
		 * mkdir(): Creates the directory named by this abstract pathname.
		 * 
		 * mkdirs(): Creates the directory named by this abstract pathname, including
		 * any necessary but nonexistent parent directories. Note that if this operation
		 * fails it may have succeeded in creating some of the necessary parent
		 * directories.
		 */
		System.out.println(dir.mkdir());
		System.out.println("-----------------------------------------");
		System.out.println("dir.exists(): " + dir.exists());
		System.out.println("dir.isFile(): " + dir.isFile());
		System.out.println("dir.isDirectory(): " + dir.isDirectory());
		
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("file.exists(): " + file.exists());
		System.out.println("file.isFile(): " + file.isFile());
		System.out.println("file.isDirectory(): " + file.isDirectory());
	}
}
