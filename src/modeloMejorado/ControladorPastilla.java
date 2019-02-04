package modeloMejorado;

public class ControladorPastilla {

	/*
	 * ingresar medicamento
	 * agregar medicamento
	 * obtener fecha hasta la que hay stock
	 * almacenar medicacion - fecha de ingreso - la fecha hasta
	 * la que hay medicacion(esto en alguna colleccion)
	 * ingresar por scanner y que devuelva la auditoria de lo ingresado
	 * 
	 */

	//controlamos que el nombre de la pastilla este en la lista
	
	
	public void ingresoMedicacion(Pastilla pas) {
		
		if(pas.getNom()=="calcio") {
		//no se si meterlo en un array
			//darle fecha de ingreso
			//o hacer que otro metodo le sume los x dias
		} else if (pas.getNom()=="calcio") {
			// igual que el anterior pero distinto array
		} else {
			System.out.println("se desconoce medicacion");
		}
		
	}
//si el nombre esta en la lista agregamos a una colleccion
	
	public void cargarMedicacionAlista() {
	
	}
//le ponemos la fecha del momento en la que se ingreso
	//y le sumamos al calendario la cantidad de pastillas por
	//dia o por horas








}