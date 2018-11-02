package test;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concursantes.Concursante;
import concursantes.Malabarista;

public class TestConcursoTalento {
	private static Log logger = LogFactory.getLog("TestConcursoTalentos");
	private Concursante malabarista1;
	private Concursante malabarista2;
	
	@Before
	public void before() {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		malabarista1 = (Concursante) context.getBean("solei");
		malabarista2 = (Concursante) context.getBean("soleiR");
	}
	
	@Test
	public void test() {
		logger.info("Inicio de ejecucion de malabarista");
		int noPelotas= 10;
		malabarista1.ejecutar();
		assertEquals(noPelotas,((Malabarista) malabarista1).getPelotas());
		logger.info("fin de ejecutar Malabarista");
		
		logger.info("Inicio de ejecucion de malabaristaR");
		noPelotas = 15;
		malabarista2.ejecutar();
		assertEquals(noPelotas,((Malabarista) malabarista2).getPelotas());
		logger.info("fin de ejecutar Malabarista2");
	}

}
