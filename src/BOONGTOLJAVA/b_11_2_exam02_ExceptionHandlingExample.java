package BOONGTOLJAVA;

public class b_11_2_exam02_ExceptionHandlingExample {
    public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println();

		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

// Class.forName은 java.lang.Class 클래스의 정적(static) 메서드로 정의되어 있습니다.
// Class는 자바 라이브러리가 아니라, 자바에서 제공하는 표준 클래스입니다.
// Class는 java.lang 패키지에 포함된 클래스 중 하나!
// forName 메서드의 역할?--> java.lang.String 이름의 클래스가 존재하는가? 를 판단하는 메서드! 존재하면 이 클래스를 메모리에 로딩해라!
// 존재 안하면 ClassNotFoundException 에러 발생
// printStackTrace는 Throwable 클래스의 메서드이며, 예외 처리 클래스에서 사용할 수 있습니다.
// ClassNotFoundException은 Java에서 Class.forName 메서드가 메모리에 특정 클래스 이름을 기반으로 클래스를 로드하려고 할 때, 해당 클래스가 JVM에서 존재하지 않으면 발생하는 예외입니다.