package com.caveofprogramming.spring.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;
import javax.annotation.*;

public class Logger {
	
	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;
	
	@Resource
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	
	@Resource(name="squirrel")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile( String text ) {
		fileWriter.write(text);
	}
	
	public void writeConsole( String text ) {
		if ( consoleWriter == null ) {
		    consoleWriter.write(text);
		}
	}
	
	@PostConstruct()
	public void init(){
		System.out.println( "init" );
	}
	
	@PreDestroy()
	public void destroy(){
		System.out.println( "destroy" );
	}
}
