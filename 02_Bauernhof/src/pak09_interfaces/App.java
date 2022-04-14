package pak09_interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
	public static void main(String[] args) {
		//Cannot instantiate the type AClass
//		AClass a = new AClass();
		
		AClass a = new AClass() {
			@Override
			void goA() {
				System.out.println("goA in anonymous Class");
			}
		};
		
		a.goA();
		
		//Cannot instantiate the type I2
//		I2 i = new I2();
		
		I2 i2 = new I2() {
			@Override
			public void goI() {
				System.out.println("goI in anonymous Class");				
			}
		};
		
		i2.goI();
		
		/*
		 * App$1
		 * 
		 * class null extends AClass{
		 * 
		 * }
		 * 
		 * App$2
		 * 
		 * class null implements I2{
		 * 
		 * }
		 * 
		 */
		ActionListener al = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Der Button wurde gedrueckt");				
			}
		};
		
		//Lambda
		ActionListener al2 = e->System.out.println("Der Button wurde gedrueckt");
		
		
	}
}

abstract class AClass{
	abstract void goA();
}

interface I2{
	void goI();
}
