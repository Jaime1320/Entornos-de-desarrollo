package com.entornos.JaimeHermana.array;

public abstract class MisArrays {

	public static double Media(int array[]) {
		double media = 0;
		for (int i=0; i < array.length; i++) {
			 media = media + array[i];
			}
		return media / array.length;
	}
}
