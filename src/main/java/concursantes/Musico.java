package concursantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Musico implements Concursante {
	// Inyeccion de valor primitivo (podemos eliminar el metodo set)
	@Value("Noche de Paz")
	String cancion;
	@Autowired
	@Qualifier("piano")
	Instrumento instrumento;
	
	public Musico() {
		
	}
	
	public String getCancion() {
		return cancion;
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
