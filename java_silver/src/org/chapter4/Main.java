package org.chapter4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		char[] arrayA = {'a','b','c','d','e'};
		char[] arrayB = new char[arrayA.length];
		System.arraycopy(arrayA, 0, arrayB, 0, 5);
		for(char c: arrayB) {
			System.out.print(c);
		}
	}
}
