package view;
import controller.Multiplica;
public class Principal {

	public static void main(String[] args) {
		controller.Multiplica cm = new controller.Multiplica();
		int n1 = 3;
		int n2 = 5;
		
		int fMult = cm.Mult(n1, n2);
		System.out.println("A multiplicação de "+ n1+" por "+n2+" é: "+fMult);
				
	}

}
