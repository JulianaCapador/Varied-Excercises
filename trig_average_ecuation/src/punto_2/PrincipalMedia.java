/*
 * NOMBRE PROGRAMA: MEDIA
 * AUTOR: JULIANA ALEXANDRA CAPADOR OCHOA
 * FECHA: 9 DE SEPTIEMBRE DE 2016
 */
package punto_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrincipalMedia {

	public static void main (String arg []) throws NumberFormatException, IOException{
		
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		//Creo el objeto
		Media promedio = new Media();
		do{
		do{
		System.out.println("Por favor ingresa el número");
		promedio.numero = Double.parseDouble(in.readLine());
		
		//Acumulador que en la clase esta inicializado en 0	
			
			promedio.acumulador = promedio.acumulador+promedio.numero;
		
			System.out.println("La media es : "+promedio.mediaNumero(promedio.acumulador));
			
			//Pregunta si desea seguir ingresando números
			do {
			System.out.println("¿Desea ingresar otro número? Digite s para si o n para no");
			promedio.pregunta = (in.readLine().charAt(0));
		
			if (promedio.pregunta == 'n'){
			System.out.println("La media final es : "+promedio.mediaNumero(promedio.acumulador));
			}
		
				if (promedio.pregunta   != 's' && promedio.pregunta  != 'n') {
					System.out.println("El dato ingresado es incorrecto");
				}
			} while (promedio.pregunta  != 's' && promedio.pregunta  != 'n');
		}while (promedio.pregunta == 's');
		
		//Pregunta para volver a ejecutar todo el programa
		do {
			System.out.println("\n");
			System.out.println("Desea volver a realizar la ejecucion escriba s para si o n no");
			promedio.validar = (in.readLine().charAt(0));

			if (promedio.validar == 'n') {
				System.out.println("Ha finalizado, muchas gracias.");
			}
			if (promedio.validar   != 's' && promedio.validar  != 'n') {
				System.out.println("El dato ingresado es incorrecto");
			}
		} while (promedio.validar != 's' && promedio.validar  != 'n');
	} while (promedio.validar == 's');
	}
}
