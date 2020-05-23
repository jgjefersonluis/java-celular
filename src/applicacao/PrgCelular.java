package applicacao;

import controller.Celular;

public class PrgCelular {

	public static void main(String[] args) {
		Celular c1 = new Celular("Gran Duo",65,"Sansung", true);
		c1.status();
		c1.sentar();
		System.out.println("");
		System.out.println("*********************");
		Celular c2 = new Celular("Galaxy Note",70,"Lg", false);
		c2.status();
		c2.sentar();
		
	}

}
