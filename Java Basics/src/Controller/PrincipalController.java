package Controller;

import javax.swing.UnsupportedLookAndFeelException;

public class PrincipalController {

	public static void main(String args[]) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		Janelas janelas = new Janelas();
		janelas.getResolucao();
		janelas.janelaPrincipal("slk teste");
	}
}
