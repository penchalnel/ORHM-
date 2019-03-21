package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Object>a=new ArrayList<>();
		a.add("Selenuim");
		a.add("Common");
		a.add("Livetech");
		a.add(10);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}

	}

}
