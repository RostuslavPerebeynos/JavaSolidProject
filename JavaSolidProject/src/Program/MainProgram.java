package Program;

import java.util.Scanner;

import IO.Data;
import IO.PrinterConsole;
import IO.ReaderConsole;
import IO.iData;
import IO.iPrinter;
import IO.iReader;
import Model.Model;
import Service.ServiceSum;
import Service.iService;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		iReader reader = new ReaderConsole(scanner);
		iPrinter printer = new PrinterConsole();
		iData data = new Data(reader, printer);
		iService service = new ServiceSum();//при створенні об'єкту ServiceSum ми почали з інтерфейсу iService щоб об'кт був залежним від цієї абстракції
		Model model = new Model();
		model.init(data);
		model.calc(service);
		model.done(data);
		
		

	}

}
