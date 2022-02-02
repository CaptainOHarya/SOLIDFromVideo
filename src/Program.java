import io.Data;
import io.IData;
import io.IPrinter;
import io.IReader;
import io.PrinterConsole;
import io.PrinterStars;
import io.ReaderConsole;
import service.IService;
import service.ServiceSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Model.Model;
import Model.Module;

public class Program {
    public static void main(String[] args) throws FileNotFoundException{
    	// File file = new File("numbers.txt");
    	//Scanner scanner = new Scanner(file);
        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
        IPrinter printer = new PrinterStars();
        // IPrinter printer = new PrinterConsole();
        IData data = new Data(reader, printer);
        IService service = new ServiceSum();
        Module module = new Module(reader, printer, service);
        module.execute();
        

    }
}
