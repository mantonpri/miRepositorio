import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, i;
		String numero_cadena;
		Scanner numero_introducido = new Scanner(System.in);

		// lectura de datos introducidos por el usuario
		System.out.println("Introduce un número de 5 cifras");
		numero = numero_introducido.nextInt();

		/*
		 * cadena vacia a la que en cada iteración se suma un digito nuevo del número
		 * empezando por el final y que se muestra en cada iteración Se consideran
		 * numeros positivos y negativos
		 */
		extracted(numero);
	}

	private static void extracted(int numero) {
		int i;
		String numero_cadena;
		numero_cadena = "";
		for (i = 0; i < 5; i++) {
			if (numero < 0) {
				numero_cadena = Integer.toString(numero).charAt(4 - i + 1) + numero_cadena;
				System.out.println("-" + Integer.parseInt(numero_cadena));
			} else {
				numero_cadena = Integer.toString(numero).charAt(4 - i) + numero_cadena;
				System.out.println(Integer.parseInt(numero_cadena));
			}
		}
	}

}