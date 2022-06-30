package marie.core;

import javax.swing.JOptionPane;

import marie.modulos.login;

public class Core implements login{

	@Override
	public void crearacceso() {
		JOptionPane.showMessageDialog(null, "Soy "+getClass().getName());		
	}

}
