package listas;

import java.util.ArrayList;

import modeloMejorado.Pastilla;

public class T4 {

	ArrayList<Pastilla> listaT4 = new ArrayList<>();

	public T4() {
	this.listaT4 = new ArrayList<>();
	}

	public T4(ArrayList<Pastilla> listaT4) {
		super();
		this.listaT4 = listaT4;
	}

	public ArrayList<Pastilla> getListaT4() {
		return listaT4;
	}

	public void setListaCalcio(Pastilla t4) {
		this.listaT4.add(t4);
	}

	public void imprimoLista() {
		for (Pastilla pastilla : listaT4) {
			System.out.println(pastilla.toString());
		}
	
	
	}

	@Override
	public String toString() {
		return "T4 lista = " + listaT4;
	}
	
}
