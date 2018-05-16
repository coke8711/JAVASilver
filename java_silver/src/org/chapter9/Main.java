package org.chapter9;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		for(String str : list) {
			if("B".equals(str)) {
				list.remove(str);
			}else
			{
				System.out.println(str);
			}
		}
	}
}
