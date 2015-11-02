package com.oogie.app;

import com.oogie.lib.Name;
import com.oogie.lib.Person;

public class Peter implements Person {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public String getName() {
		return Name.PETER;
	}
}
