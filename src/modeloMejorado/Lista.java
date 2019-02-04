package modeloMejorado;

import java.util.ArrayList;

public class Lista {
	
	ArrayList<Pastilla> listx = new ArrayList<>();

	public Lista() {
		super();
	}

	public Lista(ArrayList<Pastilla> listx) {
		super();
		this.listx = listx;
	}

	public ArrayList<Pastilla> getListx() {
		return listx;
	}

	public void setListx(Pastilla listax) {
		this.listx.add(listax);
	}
	
	public void imprimoLista() {
		for (Pastilla pastilla : listx) {
			System.out.println(pastilla.toString());
			System.out.println("----------------------");
		}
	}

	
	
	

}
