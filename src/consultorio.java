/*
 * El consultorio del Dr. Lorenzo T. Mata Lozano tiene como política cobrar la consulta con base en el
número de cita, de la siguiente forma:
• Las tres primeras citas a $200.00 c/u.
• Las siguientes dos citas a $150.00 c/u
• Las tres siguientes citas a $100.00 c/u.
• Las restantes a $50.00 c/u, mientras dure el tratamiento.
Se requiere un programa en java para llegar a la solución:
a) Se requiere un algoritmo para determinar:
b) El monto de lo que ha pagado el paciente por el tratamiento
Para la solución de este problema se requiere saber qué número de cita se efectuará, con el cual se podrá
determinar el costo que tendrá la consulta y cuánto se ha gastado en el tratamiento
 * */

import java.util.Scanner;

public class consultorio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double numero_cita = 0;
		double total_pagar = 0;
		
		System.out.println("ingrese su numero de cita: ");
		numero_cita = entrada.nextDouble();
		
		if (numero_cita <= 3) {
			System.out.println("Su cita cuesta 200 pesos");
			
		} else if (numero_cita <= 5) {
			System.out.println("Su cita cuesta 150 pesos: ");
			
		} else if (numero_cita <= 8) {
			System.out.println("Su cita cuesta 100 pesos : ");
			
		} else {
			System.out.println("Su cita cuesta 50 pesos: ");
			
		}
		

	}

}
