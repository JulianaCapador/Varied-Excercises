/*
 * NOMBRE PROGRAMA: TRIGONOMETRICAS
 * AUTOR: JULIANA ALEXANDRA CAPADOR OCHOA
 * FECHA: 9 DE SEPTIEMBRE DE 2016
 */
package punto_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrincipalTri {

	public static void main(String arg[]) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// Creo el objeto
		Trigonometricas funciones = new Trigonometricas();

		// Menú de Opciones
		do {
			do {
				System.out.println("Por favor seleccione la función que desea realizar");
				System.out.println("1. Seno");
				System.out.println("2. Coseno");
				System.out.println("3. Tangente");

				funciones.opcionSeleccionada = Integer.parseInt(in.readLine());

				if (funciones.opcionSeleccionada != 1 && funciones.opcionSeleccionada != 2
						&& funciones.opcionSeleccionada != 3) {
					System.out.println("El dato ingresado es incorrecto");
				}
			} while (funciones.opcionSeleccionada != 1 && funciones.opcionSeleccionada != 2
					&& funciones.opcionSeleccionada != 3);

			// Realiza operaciones
			if (funciones.opcionSeleccionada == 1) {

				System.out.println("Por favor ingrese el valor del angulo");
				funciones.angulo = Double.parseDouble(in.readLine());

				System.out.println("El seno del ángulo es: " + (funciones.funcionSeno(funciones.angulo)));
			} else {

				if (funciones.opcionSeleccionada == 2) {

					System.out.println("Por favor ingrese el valor del angulo");
					funciones.angulo = Double.parseDouble(in.readLine());

					System.out.println("El coseno del ángulo es: " + (funciones.funcionCoseno(funciones.angulo)));

				} else {
					if (funciones.opcionSeleccionada == 3) {
						do {
							System.out.println("Por favor ingrese el valor del angulo");
							funciones.angulo = Double.parseDouble(in.readLine());
							if (funciones.angulo == 90 || funciones.angulo == 270) {
								System.out.println(
										"El dato ingresado no es correcto, la tangente no esta definida para este ángulo");
							}
						} while (funciones.angulo == 90 || funciones.angulo == 270);
						
							if (funciones.angulo%90 == 0 && funciones.angulo != 180){
								System.out.println("La tangente del ángulo no esta definido");
							}
							else{
								System.out.println("La tangente del ángulo es: " + funciones.funcionTangente(funciones.angulo));
							}
							
							
						

						
						}
					}
				}
			// Pregunta si desea realizar volver a ejecutar el programa
			do {
				System.out.println("Desea volver a realizar la ejecucion escriba s para si o n no");
				funciones.validar = (in.readLine().charAt(0));

				if (funciones.validar == 'n') {
					System.out.println("Ha finalizado, muchas gracias.");
				}
				if (funciones.validar != 's' && funciones.validar != 'n') {
					System.out.println("El dato ingresado es incorrecto");
				}
			} while (funciones.validar != 's' && funciones.validar != 'n');
		} while (funciones.validar == 's');

	}

}
