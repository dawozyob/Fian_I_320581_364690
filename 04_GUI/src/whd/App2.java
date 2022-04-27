package whd;

public class App2 {
	public static void main(String[] args) {
		Person2 person2 = new Person2();
		person2.p = person2;
		person2.name = "Markus";
		
		System.out.println(person2.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.p.name);
		
	}
}

class Person2{
	Person2 p;
	String name;
}
