package pak07_vererbung;

public class App {
	public static void main(String[] args) {
		Vater vater = new Sohn();
		Sohn sohn = new Sohn();
		
		System.out.println(vater.name); //Vater
		System.out.println(sohn.name); //Sohn
		
		
		Sohn s1 = (Sohn)vater;
		System.out.println(((Sohn)vater).name); //Sohn
		
		System.out.println("--------------------------------");
		Sohn sohn1 = new Sohn();
		sohn1.setName("Name geaendert");		
		System.out.println(sohn1.name); //Name geaendert?
		System.out.println(sohn1.getName());
		
		System.out.println("--------------------------------\n");
		Vater v = new Sohn();
		v.go();
		
	}
}





