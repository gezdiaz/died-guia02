package died.guias.guia02.app;
import java.util.Date;
import java.util.GregorianCalendar;
/**
* @author marti
*
*/
public class hola2 {
	/**
	 * Este metodo ejecuta la aplicacion cuyo proposito sera imprimir en consola
	 * el dia, mes y año actual.
	 * luego sumarle 250 horas a dicha fecha e imprimir la fecha futura
	* @param args
	*/
	public static void main(String[] args) {
		Date fechaActual = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(fechaActual);
		Integer dia = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		// tener en cuneta que en JAVA para la clase Calendar, el mes empieza en 0,
		// Enero es el mes 0, no el 1
		Integer mes = 1 + calendar.get(GregorianCalendar.MONTH);
		Integer anio = calendar.get(GregorianCalendar.YEAR);
		System.out.println("La fecha actual es "+dia+"/"+mes+"/"+anio);
		calendar.add(GregorianCalendar.HOUR, 250);
		dia = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		mes = 1 + calendar.get(GregorianCalendar.MONTH);
		anio = calendar.get(GregorianCalendar.YEAR);
		System.out.println("La fecha en 250 horas sera: "+dia+"/"+mes+"/"+anio);

	}

}
