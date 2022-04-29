package demo03_exceptions;

import java.io.IOException;

public class Demo01_Exception {
	public static void main(String[] args) {
		String s = null;

		try {
			method01(s);
		} catch (NullPointerException npe) {
//			npe.printStackTrace();
			System.out.println(npe.getMessage());
		}

		//unchecked
		unchecked01();
		/*
		 * checked
		 * Die Behandlung einer checked Exception 
		 * wird vom Compiler erzwungen.
		 */
		try {
			checked01();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Programm beendet");
	}

	public static void method01(String s) throws NullPointerException {
		method02(s);
	}

	public static void method02(String s) {
		System.out.println(s.length());
	}

	public static void unchecked01() throws NullPointerException {

	}

	public static void checked01() throws IOException {

	}
}
