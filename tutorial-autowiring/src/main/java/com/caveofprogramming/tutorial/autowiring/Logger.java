package com.caveofprogramming.tutorial.autowiring;

public class Logger {
	
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	public ConsoleWriter getConsoleWritter() {
		return consoleWriter;
	}
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	public FileWriter getFileWriter() {
		return fileWriter;
	}
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile( String text ) {
		fileWriter.write(text);
	}
	
	public void writeConsole( String text ) {
		consoleWriter.write(text);
	}
}
