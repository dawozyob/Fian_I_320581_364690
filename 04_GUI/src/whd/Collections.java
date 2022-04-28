package whd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Collections {
	public static void main(String[] args) {
		//Initialisierung eines Arrays mit der Groesse 3
		//Das Array wird dabei mit Standardwerten des Datentyps befuellt 
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//Implizite Initialisierung
		//Die Groesse des Arrays wird bestimmt durch die Anzahl der Werte
		//in der geschweiften Klammer
		int[] arr2 = new int[]{11,25,390};
		System.out.println("arr2.length: " + arr2.length);
		
		int[] arr3 = {11,25,390};
		int zahl = 100;
		int[] arr4 = new int[arr3.length +1];
		for (int i = 0; i < arr3.length; i++) {
			arr4[i] = arr3[i];
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		
		
		
	}
}
