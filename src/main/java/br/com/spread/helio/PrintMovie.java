package br.com.spread.helio;

import java.util.function.Consumer;

@SuppressWarnings("rawtypes")
public class PrintMovie implements Consumer {

	public void accept(Object t) {
		// TODO Auto-generated method stub
		System.out.println(((Movie)t));
	}

}
