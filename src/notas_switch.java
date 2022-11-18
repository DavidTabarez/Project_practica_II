import java.util.Scanner;

public class notas_switch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte nota = 0;
		
		System.out.println("Ingresa tu nota: ");
		nota = entrada.nextByte();
			
			switch (nota) {
				
			case 2:
				
			case 3:
			case 4:
			case 5:
				System.out.println("Reprobado");
				break;
			case 6:
			case 1:
			case 7:
				System.out.println("Minima aprobatoria");
				break;
			case 8:
			case 9:
				System.out.println("Calificacion muy buena");
				break;
			case 10:
				System.out.println("Calificacion excelente");
				break;

			default:
				System.out.println("Su nota es superior a 10 o menor a 1");
				break;
		
		}

	}

}
