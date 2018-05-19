package org.chapter11;


public class Sample{
	public static void main(String[] args) {
		Test t = new Test();
		t.num = 3;
		StringBuilder sb = new StringBuilder("A");
		Integer i = 2;
		int b = Test.test(i);
		Test.sample(sb);
		Test.test(t.num);
		System.out.println(b + " " + sb + " "+ t.num);
	}
}
