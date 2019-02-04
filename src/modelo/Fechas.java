package modelo;

import java.util.ArrayList;

public class Fechas {
	
	private ArrayList<Object> lista = new ArrayList<>();

	public Fechas(ArrayList<Object> lista) {
		super();
		this.lista = lista;
	}

	public Fechas() {
		this.lista = new ArrayList<Object>();
	}

	public ArrayList<Object> getLista() {
		return lista;
	}

	public void setLista(Object lista) {
		this.lista.add(lista);
	}
	
	public void muestroLista() {
		for (Object object : lista) {
			System.out.println(object.toString());
		}
		
//		System.out.println("------------------------");
		
//		System.out.println(lista.lastIndexOf(lista));
//		System.out.println();
	}
	
	
	

}
