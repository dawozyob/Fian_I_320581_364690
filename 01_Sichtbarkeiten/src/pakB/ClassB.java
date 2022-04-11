package pakB;

import pakA.ClassA;

public class ClassB extends ClassA{
	void testAccess() {
		var ref = new ClassA();
		ref.pubMethod();
		  
		//The method privMethod() from the type ClassA is not visible
//		ref.privMethod();
		
		//The method defMethod() from the type ClassA is not visible
//		ref.defMethod();
		
		//Zugriff �ber eine Objektreferenz
//		ref.protMethod();
		//Zugriff �ber Vererbung
		this.protMethod();
	}
}
