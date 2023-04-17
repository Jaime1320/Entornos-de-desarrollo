package com.entornos.JaimeHermana.array;
/**
 * Crea una array y realiza los metodos de calcular media, calcular la mediana, calcular el maximo y calcular el minimo 
 * 
 * @version 1.0
 * 
 * @author Jaime
 * 
 */
public abstract class MisArrays {
	/**
     * Recibe un array de números enteros y devuelve la media con decimales de dicho array.
     * @param Recibe un array de números enteros
     * @return devuelve la media con decimales de dicho array.
     */
	public static double Media(int array[]) {
		double media = 0;
		for (int i=0; i < array.length; i++) {
			 media = media + array[i];
			}
		return media / array.length;
	}
	/**
	 * Recibe un array de números enteros y devuelve la mediana con decimales de dicho array.
	 * @param Recibe un array de números enteros
	 * @return devuelve la mediana con decimales de dicho array.
	 */
	public static double Mediana(int array[]) {
		int mediana;
		int mitad = array.length / 2;
		if (array.length % 2 == 0) {
		    mediana = (array[mitad - 1] + array[mitad]) / 2;
		} else {
		    mediana = array[mitad];
		}
		return mediana;
	}
}
