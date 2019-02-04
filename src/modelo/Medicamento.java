package modelo;

import java.util.Calendar;

public class Medicamento extends Fechas{

	private String nombre;
	private int cantidad;

	
	public Medicamento() {
		super();
	}

	public Medicamento(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int stockHasta() {
		int diaz = 0;
		if(this.nombre == "calcio" ) {
			diaz = this.cantidad; 
		}			
		return diaz;
	}

	public void StockHasta() {
		String esto = "sin resultado";
		if(this.stockHasta()!=0) {
			esto = "dias";
			int e = stockHasta();
			System.out.println("Rinde: " + esto +" "+ e);
		}
	}	
	// el punto es si ingreso una medicacion nueva tome la fecha actual y setee la fecha en la 
    // que se acaba por medio de add dias = cantidad de unidades de la medicacion
		// si la medicacion ya esta en la lista que tome la fecha de la ultima dosis y apartir de
	// ahi le sume las dosis por dia
	
	// tendria que haber algun metodo que tipo ingreso() y uso() u como atributo donde ingreso es la
	// fecha en la que se ingreso el med y uso quese rellene por medio de un metodo en el cual
	// el valor ingresado sea el resultante de la suma de dias que hay entre la ultima pastilla y 
	// y la cantidad de pastillas que se ingresan
	
		
//	public Calendar ingresoMedicacion() {
//		Calendar o = Calendar.getInstance();
//		
//		o.add(Calendar.DATE, 30);
//		
//		return o;
//	}

	public void muestro30Mas() {
		Calendar o = Calendar.getInstance();
		o.add(Calendar.DATE, cantidad);
		System.out.println(o.getTime());
	
		Fechas f = new Fechas();
		f.setLista(o.getTime());
		f.muestroLista();
		
		
	}
	
	public void almacenoFecha() {
		
	}
	
	
			
		
	
}
