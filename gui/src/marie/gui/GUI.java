package edu.presentacion;

import javax.swing.JOptionPane;

import marie.modulos.cargarnota;
import marie.modulos.notas;

public class GUI implements IEntrada,ISalida{

	@Override
	public void desplegarinfo() {
		JOptionPane.showMessageDialog(null, "Soy salida "+getClass().getName());	
		
	}

	@Override
	public void cargarnotas() {
		JOptionPane.showMessageDialog(null, "Soy entrada "+getClass().getName());	
		
	}

}