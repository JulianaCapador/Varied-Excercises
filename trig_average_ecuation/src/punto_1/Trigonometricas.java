/*
 * NOMBRE PROGRAMA: TRIGONOMETRICAS
 * AUTOR: JULIANA ALEXANDRA CAPADOR OCHOA
 * FECHA: 9 DE SEPTIEMBRE DE 2016
 */
package punto_1;

public class Trigonometricas {

	public Trigonometricas() {
		
	}
	//Declaro variables
	double angulo;
	int opcionSeleccionada;
	double seno;
	double coseno;
	double tangente;
	char validar;
	
	//Método para la función seno
	double funcionSeno (double angulo){
		
	return Math.sin(Math.toRadians(angulo));
	}
	
	//Método para la función coseno
	double funcionCoseno (double angulo){
		
		return Math.cos(Math.toRadians(angulo));
	}
	//Método para la función tangente
	double funcionTangente(double angulo){
		
		return Math.round(Math.tan(Math.toRadians(angulo)));
	}
	
	
}
