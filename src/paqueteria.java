import java.util.Scanner;

public class paqueteria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		byte ubicacion = 0;
		double kilos = 0;
		double total_pagar = 0;
		double gramos = 0;
		double precio_lugar = 0; 
		String destino = "";
		
		System.out.println("Ingrese los kilos que pesa su producto: ");
		kilos = entrada.nextDouble();
		gramos = (kilos * 1000);
		
		if (kilos>5) {
			System.out.println("El producto es superior a los 5 kilos, por lo tanto no sera transportado: ");
			
		} else {
			System.out.println("Selecione el lugar a donde desea que el paquete sea enviado: ");
			System.out.println("América del norte (1): ");
			System.out.println("América Central (2): ");
			System.out.println("América del Sur (3): ");
			System.out.println("Europa (4): ");
			System.out.println("Asia (5) : ");
			ubicacion = entrada.nextByte();
			
			if (ubicacion == 1) {
				precio_lugar = 11.00;
				destino = "América del norte";
				
			} else if (ubicacion == 2) {	
				precio_lugar = 10.00;
				destino = "América Central";
				
			} else if (ubicacion == 3) {
				precio_lugar = 12.00;
				destino = "América del sur";
				
			} else if (ubicacion == 4) {
				precio_lugar = 24.00;
				destino = "Europa";
				
			} else  if (ubicacion == 5){
				precio_lugar = 27.00;
				destino = "Asia";
				
				
			} else {
				System.out.println("Este numero no corresponde a ninguna ubicacion de envio");		
				
			}
			
			total_pagar = (gramos * precio_lugar);
			System.out.println("Tu total a pagar es de: " + total_pagar);
			System.out.println("su paquete es enviado desde: " + destino);
			
		}
	
			
	}

}
