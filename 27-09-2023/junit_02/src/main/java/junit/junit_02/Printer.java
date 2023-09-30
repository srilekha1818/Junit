package in.ineuron.nitin.service;

public class Printer {
	private static Printer Instance;//=new Printer();
	

	private Printer() {
		
	}
	public static Printer getInstance() {
		return Instance;
	}
	
}
