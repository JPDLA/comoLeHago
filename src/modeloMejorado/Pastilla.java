package modeloMejorado;

public class Pastilla {
	
	private String nom;
	private int cant;
	
	public Pastilla() {
		super();
	}

	public Pastilla(String nom, int cant) {
		super();
		this.nom = nom;
		this.cant = cant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	
	
}
