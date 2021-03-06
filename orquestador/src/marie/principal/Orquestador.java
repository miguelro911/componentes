package marie.principal;

import marie.modulos.cargarnota;
import marie.modulos.login;
import marie.modulos.notas;
import marie.utilidades.Cargador;

import javax.swing.JOptionPane;
 
public class Orquestador { 
	void moderar() {
		Class cls = null;
		
		final Cargador cf = new Cargador("front");		
		cls = cf.getClase(cargarnota.class.getName());
		try{
			final IEntrada ie = (IEntrada) cls.newInstance();
			ie.recibirInformacion();
		}catch(Exception exc){
			JOptionPane.showMessageDialog(null, "no hay GUI...");
		}
		
		final Cargador cb = new Cargador("back");
		cls = cb.getClase(IRegla.class.getName());
		try{
			final IRegla ie = (IRegla) cls.newInstance();
			ie.verificarRaglas();
		}catch(Exception exc){
			JOptionPane.showMessageDialog(null, "no hay Core...");
		}

		cls = cf.getClase(IEntrada.class.getName());
		try{
			final ISalida ie = (ISalida) cls.newInstance();
			ie.desplegarInformacion();
		}catch(Exception exc){
		 	JOptionPane.showMessageDialog(null, "no hay GUI...");
		}
	}

	public static void main(final String[] args) {		
		new Orquestador().moderar();
	}

}