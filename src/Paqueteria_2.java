import java.util.Scanner;

public class Paqueteria_2 {

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
		
		if (kilos>5 || kilos<=0) {
			System.out.println("El producto es superior a los 5 kilos o ingreso un numero incorrecto, por lo tanto no sera transportado. ");
			
		} else {
			System.out.println();
			System.out.println("Selecione el lugar a donde desea que el paquete sea enviado: " + "\n\n"
								+"America del Norte\t(1)" + "\n"
								+"America Central\t\t(2)" + "\n"
								+"America del sur\t\t(3)" + "\n"
								+"Europa\t\t\t(4)" + "\n"
								+"Asia\t\t\t(5)" + "\n");
			ubicacion = entrada.nextByte();
			
			switch (ubicacion) {
			case 1:
				precio_lugar = 11.00;
				destino = "América del norte";
				total_pagar = (gramos * precio_lugar);
				System.out.println("Tu total a pagar es de: " + total_pagar);
				System.out.println("su paquete es enviado desde: " + destino);
				break;
			case 2:
				precio_lugar = 10.00;
				destino = "América Central";
				total_pagar = (gramos * precio_lugar);
				System.out.println("Tu total a pagar es de: " + total_pagar);
				System.out.println("su paquete es enviado desde: " + destino);
				break;
			case 3:
				precio_lugar = 12.00;
				destino = "América del sur";
				total_pagar = (gramos * precio_lugar);
				System.out.println("Tu total a pagar es de: " + total_pagar);
				System.out.println("su paquete es enviado desde: " + destino);
				break;
			case 4:
				precio_lugar = 24.00;
				destino = "Europa";
				total_pagar = (gramos * precio_lugar);
				System.out.println("Tu total a pagar es de: " + total_pagar);
				System.out.println("su paquete es enviado desde: " + destino);
				break;
			case 5:
				precio_lugar = 27.00;
				destino = "Asia";
				total_pagar = (gramos * precio_lugar);
				System.out.println("Tu total a pagar es de: " + total_pagar);
				System.out.println("su paquete es enviado desde: " + destino);
				break;

			default: 
				System.out.println("Este numero no corresponde a ninguna ubicacion de envio");
				break;
			}
			
		} 
		
	}

}
