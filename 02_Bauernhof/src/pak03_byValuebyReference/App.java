package pak03_byValuebyReference;

public class App {
	public static void main(String[] args) {

		int zahl = 10;
		doStuff(zahl);
		System.out.println(zahl);
		
		MyClass m = new MyClass();
		m.name = "Markus";
		
		System.out.println(m.name);
		doStuff(m);
		System.out.println(m.name);
	}
	
	public static void doStuff(int wert) {
		wert++;
		System.out.println("wert: " + wert);
	}
	public static void doStuff(MyClass ref) {
		ref.name = "Geaendert";	
	}
}

class MyClass{
	String name;
}