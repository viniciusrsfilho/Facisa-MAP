
class Incremental { 

	private static int count = 0; 
	private int numero;
	private static Incremental singleInstance = new Incremental();

	private Incremental() { 
		numero = ++count; 
	} 
	
	public String toString() { 
		return "Incremental " + numero; 
	} 
	
	static Incremental getInstance() {
		return singleInstance;
	}
} 
	
