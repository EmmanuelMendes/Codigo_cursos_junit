package br.com.projectTest;

public class funcoes {
	
	operadores operadoresFuncoes = new operadores();
	
	public int funcaoPrimeiro(int a, int b) { //formula f(X) = ax + b, sendo a diferente de zero	
		
		if(a!= 0) {
			int fx = -b / a;
			return fx;
		}
		System.out.println("A = 0, não sendo função do primeiro grau");
		return b;
		
	}
	public int funcaoDoSegundoGrau(int a, int b, int c) {
		
		
		return 0;
	}

}
