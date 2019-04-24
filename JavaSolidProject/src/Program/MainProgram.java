package Program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import IO.Data;
import IO.PrinterConsole;
import IO.PrinterStars;
import IO.ReaderConsole;
import IO.iData;
import IO.iPrinter;
import IO.iReader;
import Model.Model;
import Service.ServiceSum;
import Service.iService;

/**
 * SOLID принципи :
 * 
 * S – The Single Responsibility Principle - Принцип единственной ответственности.
 * Краткое описание: Любой сложный класс должен быть разбит на несколько простых составляющих, 
 * отвечающих за определенный аспект поведения, что упрощает как понимание, так и будущее развитие.
 * 
 * O – The Open-Closed Principle - Принцип Открыт-Закрыт
 * Определение: Программные сущности (классы, модули, функции и т.п.) 
 * должны быть открытыми для расширения, но закрытыми для модификации.
 * Краткое описание: закрытость модулей означает стабильность интерфейса и возможность использования 
 * классов/модулей клиентами. Открытость модулей означает возможность внесения изменений в поведении, 
 * путем изменения реализации или же путем переопределения поведения в наследниках. 
 * Борьба с изменениями заключается в ограничении количества изменений минимальным числом классов/модулей
 * и не подразумевает возможность изменения поведения без перекомпиляции. 
 * На практике требуемая «гибкость» обеспечивается за счет наследования и сопоставления с образцом
 * (pattern matching), в зависимости от того, какую операцию мы хотим упростить – добавление нового подтипа
 * в иерархию наследования или добавление новой операции в семейство типов.
 * 
 * L – The Liskov Substitution Principle - Принцип замещения Барбары Лисков
 * Определение: Должна быть возможность вместо базового типа подставить любой его подтип.
 * Смысл: Реализуйте наследование подтипов правильно.
 * 
 * I – Interface Segregation Principle - Принцип разделения интерфейсов
 * Определение: клиенты не должны вынужденно зависеть от методов, которыми не пользуются.
 * Смысл: класс должен предоставлять удобный интерфейс с точки зрения его разнообразных клиентов
 * 
 * D – The Dependency Inversion Principle - Принцип инверсии зависимостей
 * Определение: Модули верхнего уровня не должны зависеть от модулей нижнего уровня. И те и другие должны зависеть от абстракций.
 * Смысл: сделать ключевые и/или изменчивые зависимости класса явными.
 * @author Ростислав
 *
 */
public class MainProgram {

	public static void main(String[] args) throws FileNotFoundException {
		//File file = new File("numbers.txt");// ми тут щи тоїмо файл в якому вказані цифри а і в 
		//Scanner scanner = new Scanner(file);
		Scanner scanner = new Scanner(System.in);
		iReader reader = new ReaderConsole(scanner);
		iPrinter printer = new PrinterStars();
		iData data = new Data(reader, printer);
		iService service = new ServiceSum();//при створенні об'єкту ServiceSum ми почали з інтерфейсу iService щоб об'кт був залежним від цієї абстракції
		Model model = new Model();
		model.init(data);
		model.calc(service);
		model.done(data);
		
		

	}

}
