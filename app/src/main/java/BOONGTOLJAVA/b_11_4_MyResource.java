package BOONGTOLJAVA;

public class b_11_4_MyResource implements AutoCloseable {
    private String name;
	
	public b_11_4_MyResource(String name) {
		this.name = name;
		System.out.println("[MyResource(" + name + ") 열기]");
	}
	
	public String read1() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource(" + name + ") 읽기]");
		return "abc";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource(" + name + ") 닫기]");
	}
}
// AutoCloseable은 Java 표준 라이브러리의 인터페이스이다! 내용은 아래와 같다!

// public interface AutoCloseable {
//    void close() throws Exception;
//}
// throws Exception은 Java에서 메서드가 예외를 발생시킬 가능성이 있음을 선언하는 키워드입니다.
// 메서드에 throws Exception을 선언하면, 해당 메서드가 Exception 클래스를 상속받은 모든 예외를 던질 수 있음을 나타냅니다.
// 간단히 말해, AutoCloseable을 구현하면(자식 클래스 만들고 객체를 만들면) 해당 객체는 try( ... ) 구문 안에 들어갈 수 있고, '그 블록'을 벗어날 때 자동으로 close() 메서드가 호출되어 자원이 정리되게 됩니다.
// 여기서 '그 블록'은 try-with-resources 구문의 본문 블록, 즉 try { ... } 중괄호 안의 영역을 의미합니다.
// try( ... ) 괄호 안에 들어갈 수 있는 객체는 AutoCloseable 인터페이스를 구현한 클래스의 인스턴스여야 합니다.
// 즉, 해당 객체는 close() 메서드가 존재하고, 이를 통해 자원을 해제할 수 있어야 try-with-resources 구문에서 자동 자원 정리가 가능합니다.
// 간단히 말해, AutoCloseable을 구현하면(자식 클래스 만들고 객체를 만들면) 해당 객체는 try( ... ) 구문 안에 들어갈 수 있고, '그 블록'을 벗어날 때 자동으로 close() 메서드가 호출되어 자원이 정리되게 됩니다.
// 네, 기본적으로 try-with-resources 구문에 들어갈 수 있는 객체는 AutoCloseable 인터페이스를 구현한 객체여야 한다는 것이 핵심 조건입니다.
// 정리하면 다음과 같습니다.
// 주요 조건: try ( ... ) 안에 들어가는 객체는 AutoCloseable 혹은 그 하위 타입(Closeable 포함)을 반드시 구현해야 합니다.
// 네, 그렇습니다. try-with-resources 구문을 사용하면 개발자가 finally 블록을 명시적으로 작성하지 않아도, 컴파일러가 내부적으로 자원을 닫는 코드를 생성해줍니다.
// 결과적으로 try 블록이 종료될 때(정상 종료든 예외 발생이든 상관 없이) 자동으로 close() 메서드가 호출되어 자원이 정리됩니다.
// 즉, 우리가 코드를 직접 작성하진 않았지만, try-with-resources 문법을 사용함으로써 컴파일러가 finally 안에 close() 호출 코드를 자동으로 추가해둔 것과 같은 효과가 납니다.