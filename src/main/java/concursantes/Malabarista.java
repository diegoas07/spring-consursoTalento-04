package concursantes;

public class Malabarista implements Concursante {

	private int pelotas;
	
	public Malabarista() {
		
	}
	
	public Malabarista(int pelotas) {
		this.pelotas = pelotas;
	}
	
	public int getPelotas() {
		return pelotas;
	}

	public void setPelotas(int pelotas) {
		this.pelotas = pelotas;
	}

	public void ejecutar() throws EjecucionException  {
		System.err.println("Malabareo  "+pelotas+" Pelotas");		
	}
	
	
	
}
