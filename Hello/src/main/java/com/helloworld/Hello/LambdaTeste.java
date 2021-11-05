package com.helloworld.Hello;

import java.util.Optional;

public class LambdaTeste {
	public static void main (String [] args) {
		Optional<String> xz1 = Optional.of("Somos todes Devs");
		String frase = xz1.get() ;
		System.out.println(frase);

	}

}
