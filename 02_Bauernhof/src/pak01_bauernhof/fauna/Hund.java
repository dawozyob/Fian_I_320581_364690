package pak01_bauernhof.fauna;

public class Hund {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Hund() {
		this("Fiffi");
	}
	
	public Hund(String name) {
		this.setName(name);
	}
	
	public void laufen() {
		System.out.println("Hund laeuft");
	}
}
