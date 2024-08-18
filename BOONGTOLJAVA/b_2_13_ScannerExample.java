package BOONGTOLJAVA;
// 자바에서 생성자(Constructor)는 클래스의 객체가 생성될 때 호출되는 특수한 메서드입니다.
import java.util.Scanner; // 변수 선언에서 변수 이름 앞에 오는 것은 데이터 타입을 지정하며, 이 데이터 타입이 클래스일 수도 있고, 기본 데이터 타입일 수도 있습니다.(클래스,인터페이스,배열 = 참조타입, 기본 데이터 타입(8개) )
// Scanner 타입의 변수는 Scanner 객체를 참조하는 변수입니다.
// Scanner 클래스의 인스턴스를 생성하고, 이를 변수에 할당하여 다양한 메서드를 호출할 수 있습니다.('의' 논리)
// System.in을 입력 소스로 사용하는 Scanner 객체를 생성합니다!--> (역으로) Scanner 의 객체는 System.in을 입력으로 받는다!
// System.in은 InputStream의 객체!
// Scanner 클래스는 InputStream이라는 클래스의 객체를 처리!(하기 위한 생성자(객체가 만들어진 순간에 자동으로 호출되는 메서드)가 존재합니다.)--> 처리하는 과정은 나중에 공부한 후 다시보기!(지금은 잘 모르니까!) 
// (이 생성자를 통해) InputStream 객체를 전달하여 Scanner 객체를 생성할 수 있습니다.
public class b_2_13_ScannerExample {	// 12행? 오른쪽에서 왼쪽으로 해석!ex) System.in 이 Scanner에 들어가서 처리된 후 이 처리를 바탕으로 한 새로운 객체가 만들어진다. 이 객체의 이름은 scanner 이고 그 데이터 타입은 Scanner 라는 클래스다!
    public static void main(String[] args) throws Exception { // 자바에서 이미 정의된 예외 클래스(Exception, RuntimeException, IOException 등)를 사용하는 경우에는 이미 상속 관계가 형성되어 있기 때문에 상속을 신경 쓸 필요가 없습니다.
		Scanner scanner = new Scanner(System.in); // 그러나, 특정한 상황에 맞는 사용자 정의 예외를 만들려면, Exception 또는 그 하위 클래스들을 상속받아 새로운 예외 클래스를 직접 정의해야 합니다.
						// Exception 이 아니거나 Exception을 상속하지 않는 클래스는 예외로 취급되지 않으며, 자바의 예외 처리 시스템에서 인식되지 않습니다.
		System.out.print("x 값 입력: "); // 자바의 예외 처리 시스템에서 인식되지 않는 클래스는 예외 처리와 관련된 기능을 사용할 수 없으며, 이를 try-catch 블록에서 처리하거나 throw 키워드를 사용하여 던질 수 없습니다.
		String strX = scanner.nextLine();// 메서드에 throws Exception을 선언하면, 해당 메서드가 Exception 클래스를 상속받은 모든 예외를 던질 수 있음을 나타냅니다.
		int x = Integer.parseInt(strX);// 즉, IOException, SQLException, NullPointerException 등 Exception의 하위 클래스에서 파생된 어떤 예외도 던질 수 있다는 뜻입니다.
// Error 클래스는 자바에서 시스템 수준에서 발생하는 심각한 문제를 나타내기 위해 사용됩니다. // 예외를 던진다는 것은 예외가 발생한다와 같은 의미다!
// 이러한 문제는 일반적으로 개발자가 코드로 처리할 수 없는 상태를 의미하며, 주로 JVM(Java Virtual Machine)에서 발생합니다.
// Error 클래스는 Throwable 클래스의 하위 클래스이며, Exception 클래스와는 구분됩니다.
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();	// scanner.nextLine()은 Java에서 Scanner 클래스의 메서드로, 입력받는 역할을 한다. 이때 6행에 의해 입력받는 내용은 System.in 이다! // 또 파이썬과 마찬가지로 입력받은 것은 기본적으로 문자열 취급된다!
		int y = Integer.parseInt(strY);		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();

		while(true) {
			System.out.print("입력 문자열: ");	
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}

		System.out.println("종료");
	}
}




