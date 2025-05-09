package BOONGTOLJAVA;

public class b_11_4_TryWithResourceExample {
    public static void main(String[] args) {
		try (b_11_4_MyResource res = new b_11_4_MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		try (b_11_4_MyResource res = new b_11_4_MyResource("A")) {
			String data = res.read2();
			//NumberFormatException 발생
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		try (
			b_11_4_MyResource res1 = new b_11_4_MyResource("A"); 
			b_11_4_MyResource res2 = new b_11_4_MyResource("B")
		) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		b_11_4_MyResource res1 = new b_11_4_MyResource("A"); 
		b_11_4_MyResource res2 = new b_11_4_MyResource("B");
		try (res1; res2) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
}

// try-with-resources 구문은 Java 7에서 도입된 문법으로, try 블록 내에서 사용하는 자원을 자동으로 해제(close)해주는 기능을 제공합니다.
// 주로 파일 입출력, 데이터베이스 연결, 네트워크 소켓, 커스텀 리소스 등 "반드시 닫아주어야 하는" 자원을 사용할 때 유용합니다.
// 자원이란 프로그램 외부의 시스템이나 장치와 연결을 유지하는 객체로, 프로그램에서 사용이 끝난 후 제대로 해제(닫기)하지 않으면 메모리 낭비나 자원 고갈, 다른 프로그램과의 충돌 등의 문제가 발생할 수 있습니다.
// 이러한 이유 때문에 자원을 사용할 때는 사용이 끝나면 반드시 닫아주어야 하는데, 이를 쉽게 해주는 문법적 편의 기능이 try-with-resources (Java)나 with 구문(Python)입니다.
// 프로그래밍에서 "자원(Resource)"이라고 부르는 것은 프로그램이 실행되는 동안 사용하고, 사용 후에는 반드시 해제(반납)해야 하는 대상들을 의미합니다.
// try( ... ) 괄호 안에 들어갈 수 있는 객체는 AutoCloseable 인터페이스를 구현한 클래스의 인스턴스여야 합니다.
// 즉, 해당 객체는 close() 메서드가 존재하고, 이를 통해 자원을 해제할 수 있어야 try-with-resources 구문에서 자동 자원 정리가 가능합니다.

// 정리하자면, data2 자체가 먼저 "블록을 빠져나간다"는 표현보다는, 두 번째로 선언한 자원(res2)이 블록 종료 후 먼저 close() 메서드를 통해 해제되는 것이라고 이해하는 것이 정확합니다.
// 이는 자바 언어가 정한 try-with-resources 구문의 동작 규칙입니다.






