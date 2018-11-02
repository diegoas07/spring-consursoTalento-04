package concursantes;

public class Musico implements Concursante {
	
	String cancion;
	Instrumento instrumento;
	
	public Musico() {
		
	}
	
	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public Instrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento) {
		this.instrumento = instrumento;
	}

	public void ejecutar() throws EjecucionException {
		System.err.println("tocando: "+cancion);
		instrumento.tocar();
	}

}
