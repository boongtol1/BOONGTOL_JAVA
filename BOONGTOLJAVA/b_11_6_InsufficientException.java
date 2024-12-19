package BOONGTOLJAVA;

public class b_11_6_InsufficientException extends Exception {
    public b_11_6_InsufficientException() {
	}

	public b_11_6_InsufficientException(String message) {
		super(message);
	}
}

// 자바에서는 예외를 클래스 형태로 표현합니다.

// 동일한 이름을 가진 메서드를 여러 개 정의하려면 파라미터 목록이 달라야 합니다.
// 생성자도 같은 원리가 적용되므로 매개변수 형식이 다르면 같은 이름(즉, 클래스 이름)을 가진 생성자를 여러 개 둘 수 있습니다.
// 여기서는 두 개의 생성자가 존재하지만, 하나는 기본 생성자, 하나는 메시지를 받는 생성자로 매개변수가 달라 오버로딩이 가능합니다.
// 생성자나 일반 메서드는 파라미터 시그니처가 다르면 같은 이름을 가진 메서드를 여러 개 둘 수 있습니다(오버로딩).
// 필드는 동일한 이름을 클래스 내에 중복 선언할 수 없습니다.

// 네, 맞습니다. super(message);는 부모 클래스인 Exception 클래스의 생성자를 호출하여, 메시지 문자열을 예외 객체의 내부 필드에 설정하는 역할을 합니다.
// 예외 객체는 생성될 때 메시지를 함께 전달받아서, 이후에 getMessage() 메서드로 해당 메시지를 확인할 수 있습니다. 
// 즉, super(message);를 통해 전달된 문자열은 예외 객체의 설명 문구로 사용되며, 이는 디버깅 정보나 사용자 알림 등에 활용됩니다.









