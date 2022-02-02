package io;

import java.util.Scanner;

public class ReaderConsole implements IReader{
	private Scanner scanner;
	

	public ReaderConsole(Scanner scanner) {
		super();
		this.scanner = scanner;
	}


	@Override
	public int read() {
		
		return scanner.nextInt();
	}
}
