package pak_11wrapper;

class TestClass{
    void probe(Object x) { System.out.println("In Object"); } 

    void probe(Number x) { System.out.println("In Number"); } 

    void probe(Integer x) { System.out.println("In Integer"); } 
    
    void probe(Byte x) { System.out.println("In Byte"); }
    
    void probe(int x) { System.out.println("In int"); }
    
    void probe(Long x) { System.out.println("In Long"); } 
    /*
	 * Unboxing + Widening: ja
	 * Widening + Boxing: 	nein
	 */
    
    /*
	 * Prioritaeten bei der Auswahl der ueberladenen Methoden:
	 * Variable Wrapper
	 * - 1. Upcast zu Number bzw. Object wenn entsprechender Wrappertyp nicht vorhanden
	 * - 2. Unboxing ohne Widening
	 * - 3. Unboxing + Widening
	 * - 4. Varargs
	 * 
	 * Variable primitiver Datentyp
	 * - 1. primitiver Parameter der exakt passt
	 * - 2. primitiver Parameter mit Widening
	 * - 3. Wrapper Parameter mit Boxing
	 * - 4. Wrapper mit Boxing und UpCast -> Number bzw. Object
	 * - 5. Varargs
	 */
    public static void main(String[] args){
        byte a = 10; 
    
        new TestClass().probe(a); 
    }
}
