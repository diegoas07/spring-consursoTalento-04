package concursantes;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrumento {

	public void tocar() {
		System.err.println("toca paino");
	} 
	
}
