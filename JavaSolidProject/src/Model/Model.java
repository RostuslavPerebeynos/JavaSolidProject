package Model;

import IO.iData;
import IO.iPrinter;
import Service.iService;

public class Model {

	int a, b, sum;
	
	/**
	 * метод ввода
	 */
	public void init(iData data) {
		a = data.input("Enter a: ");
		b = data.input("Enter b: ");
	}
	
	/**
	 * метод рахування
	 */
	public void calc(iService service) {
		sum = service.calculate(a, b);
	}
	
	/**
	 * метод закінчити
	 */
	public void done(iPrinter printer) {
		printer.print("Result: " + sum);
	}
}
