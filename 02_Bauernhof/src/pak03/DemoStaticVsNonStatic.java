package pak03;

public class DemoStaticVsNonStatic {
	public static String staticAttr = "static";
	public String nonStatic = "nonStatic";
	
	public static void staticGo() {
		System.out.println("staticGo");
	}
	
	public void nonstaticGo() {
		System.out.println("nonstaticGo");
	}
	
	public static void main(String[] args) {
		//static
		staticGo();
		DemoStaticVsNonStatic.staticGo();
		
		System.out.println(staticAttr);
		System.out.println(DemoStaticVsNonStatic.staticAttr);
		
		//nonstatic
//		System.out.println(this.nonStatic);
//		this.nonstaticGo();
		
		var obj = new DemoStaticVsNonStatic();
		obj.nonstaticGo();
		System.out.println(obj.nonStatic);
	}
	
	void testAccess() {
		this.nonstaticGo();
	}
	
	static void testAccessStatic() {
//		System.out.println(this.nonStatic);
//		this.nonstaticGo();
	}
}
