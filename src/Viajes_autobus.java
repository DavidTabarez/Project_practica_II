import java.util.Scanner;

/*
 * Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C), 
 * cada uno tiene un precio por
kilómetro recorrido por persona, los costos respectivos son $2.0, $2.5 y $3.0. 
Se requiere determinar el
costo total y por persona del viaje considerando que cuando éste se presupuesta 
debe haber un mínimo de 20 personas, de lo contrario el cobro se realiza con base 
en este número límite. Realizar Solución en java
 * 
 * 
 * 
 * */
public class Viajes_autobus {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
		 
		 char auto_bus; 
		 double kilometro_recorrer = 0;
		 double numero_por_personas = 0;
		 double costo_kilometro = 0;
		 double costo_persona = 0;
		 byte numero_persona = 0;
		 double costo_autobus = 0;
		
		 
		 
		 System.out.println("Ingrese tipo de autobus");
		 System.out.println("tipo A (1), tipo B (2), tipo C (3)");
		 auto_bus = (char) entrada.nextInt();
		 
		 System.out.println("Kilometros recorridos: ");
		 kilometro_recorrer = entrada.nextDouble();
		 
		 System.out.println("Numero de personas: ");
		 numero_por_personas = entrada.nextDouble();
		 
		 if (auto_bus == 1) {
			costo_autobus = 2.0;
			
		 } else if (auto_bus == 2) {
			 costo_autobus = 2.5;
			 
		 } else {
			 costo_autobus = 3.0;
			 
		 } // fin del if else
		 
		 
		 if (numero_por_personas < 20) {
			 numero_persona = 20;
			 
		 } else {
			 numero_persona = (byte) numero_por_personas;
			 
		 } // fin del if else 2
		 
		 costo_kilometro = ((numero_persona*costo_autobus)*kilometro_recorrer);
		 costo_persona = (costo_kilometro / numero_por_personas);
		 
		 System.out.println("Costo kilometros: " + costo_kilometro);
		 System.out.println("Costo por persona: " + costo_persona);

	}

}
