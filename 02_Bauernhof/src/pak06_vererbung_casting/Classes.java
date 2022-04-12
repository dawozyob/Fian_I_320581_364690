package pak06_vererbung_casting;

public class Classes {

}
class A {
	
	public A() {
		System.out.println("Konstruktor von A");
	}
	
	public void goA() {

	}
}

class B extends A {
	
	public B() {
//		super();
		this("");
		System.out.println("Konstruktor von B");
	}
	
	public B(String ref) {
		System.out.println("Parametrisierter Konstruktor von B");
	}
	
	public void goB() {

	}
}

class C extends B {
	public void goC() {

	}
}

class D extends B {
	public void goD() {

	}
}