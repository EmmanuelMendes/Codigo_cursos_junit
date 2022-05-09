package br.com.projectTest;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class operadoresTest {
	
	operadores calculoSimples;
	@BeforeEach
	public void init() {
		calculoSimples = new operadores();
	}

	@Test
	public void test() {
		
		operadores calculadora = new operadores();
		int esperadoSoma = 10;
		int esperadoSubtracao = 9;
		int esperadoDivisao = 5;
		int esperadoMultiplicacao = 20;
		
		int esperadoSoma2 = 6;
		int esperadoSubtracao2 = 1;
		int esperadoDivisao2 = 2;
		int esperadoMultiplicacao2 = 30;

		
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
		
		assertEquals(esperadoSoma2, soma2, "metodo soma");
		assertEquals(esperadoSubtracao2, sub2, "método divisão");
		assertEquals(esperadoDivisao2, div2, "metodo divisão");
		assertEquals(esperadoMultiplicacao2, mult2, "método multiplicação");
		
		
	}
	@Test
	public void testeSoma() {
		
		assertThrows(ArithmeticException.class, () -> calculoSimples.div(1, 0), "Valor retornado não era o esperado");
		
		
	}
	@Test
	public void testeFuncoes() {
		funcoes funcao = new funcoes();
		
		int funcaoPrimerioGrau = funcao.funcaoPrimeiro(0, 10);
		int esperado = 10;
		assertEquals(esperado, funcaoPrimerioGrau, "método funcao do primeiro grau");		
		
	}

}
