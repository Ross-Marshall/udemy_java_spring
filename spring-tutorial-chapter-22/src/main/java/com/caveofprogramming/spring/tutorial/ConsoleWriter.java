package com.caveofprogramming.spring.tutorial;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println( text );
		
	}

}
