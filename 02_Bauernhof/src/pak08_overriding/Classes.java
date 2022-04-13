package pak08_overriding;

public class Classes {

}

class A {
	private String test;
	
	public void go() {

	}

	private void go2() {

	}
	
	public void go3() {
		
	}
	
	void go4() {
		
	}
}

class B extends A {
	/*
	 * Die Sichtbarkeit darf beim ueberschreiben nicht
	 * eingeschraenkt werden
	 */
//	void go3(){}
	/*
	 * Aber erweitert
	 */
	public void go4() {
		
	}
	
	/*
	 * Overload Die geerbte Methode wird ueberladen
	 */
	public void go(String a) {

	}
	
	/*
	 * Die Methode go2() in der Elternklasse
	 * ist fuer die Kindklasse nicht sichtbar,
	 * darum kann sie auch nicht ueberschrieben werden
	 */
	public void go2() {

	}
	
	
	
}