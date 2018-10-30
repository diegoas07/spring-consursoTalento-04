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
	
	@Before
	public void before() {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		malabarista1 = (Concursante) context.getBean("solei");
		
	}
	
	@Test
	public void test() {
		logger.info("Inicio de ejecucion de malabarista");
		int noPelotas= 5;
		malabarista1.ejecutar();
		assertEquals(noPelotas,((Malabarista) malabarista1).getPelotas());
		logger.info("fin de ejecutar Malabarista");
	}

}
