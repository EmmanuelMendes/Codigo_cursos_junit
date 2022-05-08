package br.com.projectTest;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


public class operadoresTest {

	@Test
	public void test() {
		
		operadores calculadora = new operadores();
		int esperadoSoma = 10;
		int esperadoSubtracao = 9;
		int esperadoDivisao = 5;
		int esperadoMultiplicacao = 20;

		
		int soma1 = calculadora.soma(5, 5);
		int sub1= calculadora.sub(10, 1);
		int div1 = calculadora.div(10, 2);
		int mult1 = calculadora.mult(10, 2);
		
		int soma2 = calculadora.soma(1, 5);
		int sub2= calculadora.sub(2, 1);
		int div2 = calculadora.div(4, 2);
		int mult2 = calculadora.mult(15, 2);
		
		assertEquals(esperadoSoma, soma1, "metodo soma");
		assertEquals(esperadoSubtracao, sub1, "método divisão");
		assertEquals(esperadoDivisao, div1, "metodo divisão");
		assertEquals(esperadoMultiplicacao, mult1, "método multiplicação");
		
		assertEquals(esperadoSoma, soma2, "metodo soma");
		assertEquals(esperadoSubtracao, sub2, "método divisão");
		assertEquals(esperadoDivisao, div2, "metodo divisão");
		assertEquals(esperadoMultiplicacao, mult2, "método multiplicação");
		
		
	}

}
