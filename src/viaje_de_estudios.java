/*
 * El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe
cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es
la siguiente: si son 100 alumnos o más, el costo por cada alumno es de $65.00; de 50 a 99 alumnos, el
costo es de $70.00, de 30 a 49, de $95.00, y si son menos de 30, el costo de la renta del autobús es de
$4000.00, sin importar el número de alumnos.
Realice una solución en java que permita determinar el pago a la compañía de autobuses y lo que debe
pagar cada alumno por el viaje

 * */

import java.util.Scanner;

public class viaje_de_estudios {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		short alumnos = 0;
		double costo_total = 0;
		double costo_alumnos = 0;
		double pagar = 0;
		
		System.out.println("Ingrese el numero de alumnos: ");
		alumnos = entrada.nextShort();
		
		if (alumnos > 100 || alumnos == 100) {
			pagar = (alumnos * 65.00);
			
		} else if (alumnos <= 99 && alumnos > 49) {
			pagar = (alumnos * 70.00);
			
		} else if (alumnos <= 49 && alumnos > 29) {
			pagar = (alumnos * 95.00);
			
		} else {
			pagar = (4000);
			
		}
		
		costo_alumnos = (pagar / alumnos); 
		System.out.println("Cada alumno debe pagar: " + costo_alumnos);
		System.out.println("Pago general: " + pagar);		

		

	}

}
