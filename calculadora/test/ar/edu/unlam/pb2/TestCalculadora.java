package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void queCuandoSumeCincoMasCincoDeDiez() {
		/*arrancamos con el final esperado para el test
		 * podemos poner las variables del mismo tipo en una misma linea separadas por un coma
		 */
		final int RESULTADO_ESPERADO=10, OPERADOR1=5, OPERADOR2=5;
		int resultadoObtenido=0;
		
		Calculadora casio=new Calculadora();
		resultadoObtenido=casio.sumar(OPERADOR1, OPERADOR2);
		
		assertEquals(RESULTADO_ESPERADO, resultadoObtenido);
		
	}
	
	@Test
	public void queCuandoSumeCincoPuntoCincoMasCincoPuntoCincoDeDiezPuntoCinco() {
		/*arrancamos con el final esperado para el test
		 * podemos poner las variables del mismo tipo en una misma linea separadas por un coma
		 */
		final double RESULTADO_ESPERADO=10.5, OPERADOR1=5.0, OPERADOR2=5.5;
		double resultadoObtenido=0;
		
		Calculadora casio=new Calculadora();
		resultadoObtenido=casio.sumar(OPERADOR1, OPERADOR2);
		
		assertEquals(RESULTADO_ESPERADO, resultadoObtenido, 0.01);
		//se agrega un delta al final, numero de ceros esperados
		assertNotNull(casio);
	}
	
	@Test
	public void queUnNumeroNegativoSeaConsideradoComoTal() {
		// preparacion de datos
		final int OPERADOR1=-5;
		//boolean resultadoObtenido = true;
		//ejecucion
		Calculadora casio=new Calculadora();
		//casio.esNegativo(OPERADOR1);
		// Validacion
		assertTrue(casio.esNegativo(OPERADOR1));
		
	}
	
	@Test
	public void testQueVerifiqueUnaDivisionValida() {
		final Integer OPERADOR1=4;
		final Integer OPERADOR2=2;
		Integer resultadoObtenido=0;
		final Integer RESULTADO_ESPERADO=2;
		Calculadora casio=new Calculadora();
		resultadoObtenido=casio.dividir(OPERADOR1,OPERADOR2);
		
		assertEquals(RESULTADO_ESPERADO, resultadoObtenido);
		
	}
	
	@Test
	public void testQueVerificaQueNoSePuedaDividirPorCero() {
		
		final Integer OPERADOR1=4;
		final Integer OPERADOR2=0;
		Boolean resultadoObtenido;
		boolean resultadoEsperado=false;
		
		Calculadora casio=new Calculadora();
		resultadoObtenido=casio.dividirPorCero(OPERADOR1,OPERADOR2);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		//assertTrue(casio.dividirPorCero(OPERADOR1,OPERADOR2));
	}
}
