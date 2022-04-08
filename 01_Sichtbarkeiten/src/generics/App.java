package generics;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
				
		var irgendwas = 10;		
		var irgendwas2 = new Schwein();
		
		GenericStall<String> s1 = new GenericStall<>();
		GenericStall<Kuh> s2 = new GenericStall<>();
		
		s1.setRef("Hallo");
		s2.setRef(new Kuh());
		
		List<Integer> list = new ArrayList<>();
	}
}
class GenericStall<T>{
	T ref;
	
	public T getRef() {
		return ref;
	}
	public void setRef(T ref){
		
	}
}

class Stall{
	Schwein schwein;
	Kuh kuh;
}

class Schwein{
	
}
class Kuh{
	
}
