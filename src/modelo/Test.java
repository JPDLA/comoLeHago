package modelo;

public class Test {
	
	public static void main(String[] args) {
		
		Medicamento m = new Medicamento("calcio", 30);
//		m.stockHasta();
	
		System.out.println();
//		m.StockHasta();
		
//		System.out.println(m.ingresoMedicacion());
		m.muestro30Mas();

		// sera buena idea amacenar las fechas en un array

		
		
		/*	
		//fecha actual en formato normal
		// lo que dice arriba
		Date fechaActual = new Date();
		System.out.println(fechaActual);
		System.out.println("-----------------------------");
		
		DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
		DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Son las: "+ formatoHora.format(fechaActual)+" de fecha: " + formatoFecha.format(fechaActual));


		 
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		// fecha actual desglosada
		Calendar fecha = Calendar.getInstance();
		int ano = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minuto = fecha.get(Calendar.MINUTE);
		int segundo = fecha.get(Calendar.SECOND);
		
		System.out.println("Fecha actual: "+ dia + "/" + mes + "/" + ano);
		System.out.printf("Hora actual: %02d:%02d:%02d %n",hora, minuto, segundo);
		System.out.println("-------------Fecha desglosada-------------");
		System.out.println("El año es: "+ ano);
		System.out.println("El mes es: "+ mes);
		System.out.println("El dia es: "+ dia);
		System.out.printf("La hora es: %02d %n",hora);
		System.out.printf("El minuto es: %02d %n",minuto);
		System.out.printf("El segundo es: %02d %n",segundo);
		*/
	Medicamento m1 = new Medicamento("calcio", 30);
	m1.muestro30Mas();
	Medicamento m2 = new Medicamento("calcio", 30);
	m2.muestro30Mas();
	Medicamento m3 = new Medicamento("calcio", 30);
	m3.muestro30Mas();
	}

}
