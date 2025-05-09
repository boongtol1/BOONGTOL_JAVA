package BOONGTOLJAVA;

public class b_11_2_exam01_ExceptionHandlingExample2 {
    public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수: " + result);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage()); //①
			//System.out.println(e.toString()); //②
			//e.printStackTrace(); //③
		} finally {
			System.out.println("[마무리 실행]\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}

// getMessage 메서드는 Java의 Throwable 클래스에서 정의된 메서드로, 예외 객체에 저장된 상세 메시지(detail message) 를 반환하는 역할을 합니다.
// 예외 처리 중 발생한 예외의 원인 또는 관련된 추가 정보를 확인하는 데 유용합니다.
// Throwable 클래스는 Java의 모든 예외(Exception)와 에러(Error)의 상위 클래스입니다.
// public String getMessage()
// 반환값은 예외 생성 시 제공된 문자열 메시지입니다. 메시지가 없으면 null을 반환합니다.
// catch (NullPointerException e) 구문에서 e는 발생한 예외 객체(NullPointerException)를 참조하는 변수입니다.
// NullPointerException은 클래스입니다.
// 하지만, 예외가 발생하면 NullPointerException 클래스의 객체가 생성됩니다.(이 객체의 이름은 없다 (익명이다)위 코드에서 e 와 같이 객체의 이름을 참조하는것은 가능!)

