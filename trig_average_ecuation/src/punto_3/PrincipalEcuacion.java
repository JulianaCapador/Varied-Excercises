/*
 * NOMBRE PROGRAMA: ECUACION
 * AUTOR: JULIANA ALEXANDRA CAPADOR OCHOA
 * FECHA: 9 DE SEPTIEMBRE DE 2016
 */
package punto_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrincipalEcuacion {

	public static void main(String arg[]) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Creo el objeto
		Ecuacion primerGrado = new Ecuacion();
		
		do{
		do {
			System.out.println("Por favor ingrese el número que acompaña la incóginta");
			primerGrado.numeroIngresado = Double.parseDouble(in.readLine());

			if (primerGrado.numeroIngresado == 0) {

				System.out.println("El dato ingresado no es correcto");
			}
		} while (primerGrado.numeroIngresado == 0);

		System.out.println("Por favor ingrese el valor de la variable independiente");
		primerGrado.variableIndependiente = Double.parseDouble(in.readLine());

		double incognita = primerGrado.calcularValorIncognita(primerGrado.variableIndependiente,
				primerGrado.numeroIngresado);
		
		System.out.println("El resultado de la ecuacion es: "+incognita);
		
		//Pregunta para volver a ejecutar todo el programa
				do {
					System.out.println("Desea volver a realizar la ejecucion escriba s para si o n no");
					primerGrado.validar = (in.readLine().charAt(0));

					if (primerGrado.validar == 'n') {
						System.out.println("Ha finalizado, muchas gracias.");
					}
					if (primerGrado.validar   != 's' && primerGrado.validar  != 'n') {
						System.out.println("El dato ingresado es incorrecto");
					}
				} while (primerGrado.validar!= 's' && primerGrado.validar != 'n');
			} while (primerGrado.validar == 's');
	}
}