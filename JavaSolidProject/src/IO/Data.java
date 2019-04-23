package IO;

public class Data implements iData {

	private iReader reader;
	private iPrinter printer;
	
	public Data(iReader reader, iPrinter printer) {
		this.reader = reader;
		this.printer = printer;
	}
	
	/**
	 * Функці яка надруковує строчку
	 * @param text
	 */
	@Override
	public void print(String text) {
		printer.print(text);
	}
	
	@Override
	public void print(int number) {
		printer.print(number);
	}
	
	/*вод даних організували тепер нище органіщовуємо вивід даних*/
	@Override
	public int read() {
		return reader.read();
	}
	

}
