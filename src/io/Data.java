package io;

//import java.util.Scanner;

// Класс занимается только выводом
public class Data implements IData {
    private IReader reader;
    private IPrinter printer;
	
	
	
	public Data(IReader reader, IPrinter printer) {
		super();
		this.reader = reader;
		this.printer = printer;
	}

	   
    @Override
    public void print(String text) {
      printer.print(text);

    }

    @Override
    public void print(int number) {
        printer.print(number);

    }

    @Override
    public int read() {
        // Это называется иньекция зависимостей
       // return scanner.nextInt();
    	return reader.read();

    }

   
}
