package controller;

public class Multiplica {

	public Multiplica() {
		super();
		}
	public int Mult(int n1, int n2) {
		if (n2 == 1||n1 ==1) {  // a função se encerra quando um dos produtos chega a 1
			return n1;  
		}
		return n1+Mult(n1,n2-1); // a função chama a si mesma decrescendo um dos produtos até ele encontrar a condição de parada
		

	}
}
