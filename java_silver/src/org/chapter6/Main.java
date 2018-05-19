package org.chapter6;

public class Main {

<<<<<<< Upstream, based on origin/master

	private static String name;
	static {
		if (name.length() == 0) {
			name = "sample";
		}
	}

	public static void main(String[] args) {
		System.out.println("hello, " + name);
=======
	public static void main(String[] args) {
		Sample s = new Sample(10);
		modify(s.num);
		System.out.println(s.num);
	}
	private static void modify(int num) {
		num *= 2;
>>>>>>> 9a358e9 실버 공부중
	}
}
