/*
 * NOMBRE PROGRAMA: ECUACION
 * AUTOR: JULIANA ALEXANDRA CAPADOR OCHOA
 * FECHA: 9 DE SEPTIEMBRE DE 2016
 */
package punto_3;

public class Ecuacion {

	public Ecuacion() {
		
	}

	double variableIndependiente;
	double numeroIngresado;
	char validar;
	
	//Método para calcular el valor de la incognita
	
	double calcularValorIncognita(double variableIndependiente,double numeroIngresado){
		
		return (-1*(variableIndependiente/numeroIngresado));
	}
}
