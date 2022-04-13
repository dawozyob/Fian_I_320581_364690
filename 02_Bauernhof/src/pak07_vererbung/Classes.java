package pak07_vererbung;

public class Classes {

}
class Vater{
	String name = "Vater";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void go() {
		System.out.println("Go in Vater");
	}
		
}

class Sohn extends Vater{
	String name = "Sohn";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void go() {
		System.out.println("Go in Sohn");
	}
}