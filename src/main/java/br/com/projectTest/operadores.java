package br.com.projectTest;

public class operadores {

	public int soma(int a, int b) {
		if(a == 0 && b ==0) {
			System.out.println("Ambos números são zero");
		}
			return a + b;
		
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

}
