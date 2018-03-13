
class Incremental { 

	private static int count = 0; 
	private static int numero;
	private static Incremental singleInstance = new Incremental();

	private Incremental() { 
	} 
	
	public String toString() { 
		return "Incremental " + numero; 
	} 
	
	public static Incremental getInstance() {
		numero = ++count; 
		return singleInstance;
	}
} 
	
