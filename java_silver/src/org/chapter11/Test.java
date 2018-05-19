package org.chapter11;

class Test {
	int num;
	static  int test(int a) {
		return a = a*a;
	}
	static void sample(StringBuilder a) {
		a.append(" " + a);
		System.out.println(a);
	}
}
