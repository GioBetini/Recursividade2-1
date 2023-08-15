package controller;

public class Multiplica {

	public Multiplica() {
		super();
		}
	public int Mult(int n1, int n2) {
		if (n2 == 1) {
			return n1;
		}
		return n1+Mult(n1,n2-1);
		

	}
}