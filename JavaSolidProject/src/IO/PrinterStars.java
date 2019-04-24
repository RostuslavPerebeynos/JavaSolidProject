package IO;

public class PrinterStars extends PrinterConsole {

	
	
	/**
	 * Цей метод створиний для того щоб в подальшому
	 * замість цифер виводи зірочки (скільки цифер при сумі 
	 * стільки зірочок)
	 */
	@Override
	public void print(int number) {
		for (int j = 0; j < number; j ++)
			print("*");
		System.out.println();
	}
}
