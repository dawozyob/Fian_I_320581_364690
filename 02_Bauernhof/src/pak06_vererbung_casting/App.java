package pak06_vererbung_casting;

public class App {
	public static void main(String[] args) {
		B b = new B();
	}

	public static void casting() {
		// Has-A
		// Is-A

		A a1 = new A();

		// Referenztyp - Objekttyp
		A b = new B();
		B b1 = new B();

		A aIsC = new C();
		B bIsC = new C();
		C cIsC = new C();

		/*
		 * Der Referenztyp bestimmt, welche Methoden zur Kompilierzeit zur Verfuegung
		 * stehen.
		 */
		aIsC.goA();
//				aIsC.goB();
//				aIsC.goC();

		bIsC.goA();
		bIsC.goB();
//				bIsC.goC();

		cIsC.goA();
		cIsC.goB();
		cIsC.goC();

		// Casting
		/*
		 * Up-Cast: Casting in die allgemeinere Richtung, also in der
		 * Vererbungshierarchie nach oben Ein Up-Cast wird implizit ausgefuehrt.
		 */
		C cIsC2 = new C();
		A aIsC2 = cIsC2;
		/*
		 * Down-Cast: Casting in die speziellere Richtung, also in der
		 * Vererbungshierarchie nach unten. Fuer einen Down-Cast muss explizit gecastet
		 * werden.
		 */
		C c1 = (C) aIsC2;
		c1.goC();
		((C) aIsC).goC();

		B b2 = new B();

		// Was wird passieren?
		/*
		 * Hier tritt ein Laufzeitfehler auf: Exception in thread "main"
		 * java.lang.ClassCastException
		 */
		C c2 = (C) b2;

		B b3 = new C();
		C c3 = (C) b3;
	}

	public static void go(C ref) {

	}

	public static void go(D ref) {

	}

}
