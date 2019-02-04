package listas;

import java.util.ArrayList;

import modeloMejorado.Pastilla;

public class Calcio {
	
	ArrayList<Pastilla> listaCalcio = new ArrayList<>();

	public Calcio() {
	this.listaCalcio = new ArrayList<>();
	}

	public Calcio(ArrayList<Pastilla> listaCalcio) {
		super();
		this.listaCalcio = listaCalcio;
	}

	public ArrayList<Pastilla> getListaCalcio() {
		return listaCalcio;
	}

	public void setListaCalcio(Pastilla calcio) {
		this.listaCalcio.add(calcio);
	}

	public void imprimoLista() {
		for (Pastilla pastilla : listaCalcio) {
			System.out.println(pastilla.toString());
		}
	
	
	}

	@Override
	public String toString() {
		return "Calcio lista = " + listaCalcio;
	}
	
	

}
