import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte mes ;
		
		System.out.println("Ingrese el mes: " + "\n\n"
				+"Enero\t\t(1)" + "\n"
				+"Febrero\t\t(2)" + "\n"
				+"Marzo\t\t(3)" + "\n"
				+"Abril\t\t(4)" + "\n"
				+"Mayo\t\t(5)" + "\n"
				+"Junio\t\t(6)" + "\n"
				+"Julio\t\t(7)" + "\n"
				+"Agosto\t\t(8)" + "\n"
				+"Septiembre\t(9)" + "\n"
				+"Octubre\t\t(10)" + "\n"
				+"Noviembre\t(11)" + "\n"
				+"Diciembre\t(12)" + "\n");
		mes = entrada.nextByte();
		
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tu mes tiene 31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tu mes tiene 30 dias");
			break;
		case 2:
			System.out.println("Tu mes tiene 28 dias");
			break;

		default:
			System.out.println("El numero que ingreso no corresponde a ningun mes");
			break;
		}
		
		
		
	}

}
