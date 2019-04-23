package IO;

import java.util.Scanner;

public class ReaderConsole implements iReader {

	private Scanner scanner;
	
	public ReaderConsole(Scanner scanner) {
		this.scanner = scanner;
	}
	
	@Override
	public int read() {
		return scanner.nextInt();
	}
}
