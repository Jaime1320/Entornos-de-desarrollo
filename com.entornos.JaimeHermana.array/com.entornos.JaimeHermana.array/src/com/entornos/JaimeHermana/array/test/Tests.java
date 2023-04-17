package com.entornos.JaimeHermana.array.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.entornos.JaimeHermana.array.MisArrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Tests {

	int array1[], array2[], array3[];

	@BeforeAll
	void iniciar() {
		array1 = new int[] {8, 23, 87, 1, 24};
		array2 = new int[] {0, 5, 9, 55, 12, 1, 1, 3};
		array3 = new int[] {3, 8, 10, 2};
	}

	@Test
	void testMedia() {
		assertEquals(29.0, Math.round(MisArrays.Media(array1)));
		assertEquals(11.0, Math.round(MisArrays.Media(array2)));
		assertEquals(6.0, Math.round(MisArrays.Media(array3)));
	}

	@Test
	void testMediana() {
		assertEquals(87.0, MisArrays.Mediana(array1));
		assertEquals(33.0, MisArrays.Mediana(array2));
		assertEquals(9.0, MisArrays.Mediana(array3));
	}

	@Test
	void testMaximo() {
		assertEquals(87, MisArrays.Maximo(array1));
		assertEquals(55, MisArrays.Maximo(array2));
		assertEquals(10, MisArrays.Maximo(array3));
	}

	@Test
	void testMinimo() {
		assertEquals(1, MisArrays.Minimo(array1));
		assertEquals(0, MisArrays.Minimo(array2));
		assertEquals(2, MisArrays.Minimo(array3));
	}
}
