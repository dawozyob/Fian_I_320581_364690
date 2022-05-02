package demo05_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface IDemo01{
	void go();
}

interface IDemo02{
	void go(int i);
}

interface IDemo03{
	void go(int i1, int i2);
}

interface IDemo04{
	int berechne(int wert1, int wert2);
}
public class Demo01_Lambda {
	
	public static void main(String[] args) {
		
		useIDemo04((i1, i2)-> {return i1 + i2;}, 10, 20);
		
		useIDemo04((i1, i2)-> {return i1 * i2;}, 10, 20);
		
		IDemo04 id4 = (i1,i2)-> i1 * i2;
		
		
		IDemo01 demo01 = new IDemo01() {			
			@Override
			public void go() {
				System.out.println("go in anonymen Objekt");				
			}
		}; 
		
		demo01.go();
		
		IDemo01 demo02 = () -> System.out.println("go in Lambda"); 
		
		demo02.go();
		
		
		IDemo02 id2 = wert -> System.out.println(wert);
		id2.go(10);
		
		
		takesLambda(wert -> System.out.println(wert + wert));
		
		takesLambda(wert -> System.out.println(wert * wert));
		
		IDemo03 id3 = (wert1, wert2) -> {
			System.out.println(wert1 + wert2);
			System.out.println("Anweisung 2");
		}; 
		
		List<String> list = new ArrayList<>();
		list.add("Eins");
		list.add("Zwei");
		list.add("Drei");
		
		list.forEach(s->System.out.println(s));
		
		list.removeIf(s-> s.startsWith("E"));
		
		System.out.println(list);
		
		
	}
	
	public static void takesLambda(IDemo02 id2) {
		id2.go(10);
	}
	
	public static void useIDemo04(IDemo04 id4, int zahl1, int zahl2) {
		id4.berechne(zahl1, zahl2);
	}
	
	public static void functionalInterfaces() {
		
		Predicate<String> pred = s->s.length()>0; 
		System.out.println(pred.test(""));
		
		Supplier<String> sup = ()->"";
		String s = sup.get();
		
		Consumer<String> con = s1->{System.out.println(s1);};
		con.accept(s);
		
		Function<String, String> func = s2->{return s.toUpperCase();};
		func.apply("");
	}
}
