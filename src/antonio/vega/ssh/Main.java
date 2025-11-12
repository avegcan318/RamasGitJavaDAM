package antonio.vega.ssh;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// Investiga el uso de random y genera por pantalla los números de la lotería
		// primitiva.
		Random random = new Random();
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, comp = 0;

		// Genera 5 números principales
		num1 = random.nextInt(9);
		num2 = random.nextInt(9);
		num3 = random.nextInt(9);
		num4 = random.nextInt(9);
		num5 = random.nextInt(9);
		// Número complementario
		comp = random.nextInt(9);
		System.out.printf("Números de la Lotería Primitiva: %d%d%d%d%d", num1, num2, num3, num4, num5);

		System.out.printf("\nNúmero Complemetario: %d", comp);

		System.out.println("¡Buena suerte en el sorteo!");

	}
}
