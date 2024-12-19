package BOONGTOLJAVA;

public interface b_8_2_RemoteControl {
	//public 추상 메소드
	public void turnOn();
}

// 추상 클래스의 특징
// 객체 생성 불가: 추상 클래스 자체로는 인스턴스를 생성할 수 없습니다.
// 추상 메서드 포함 가능: 추상 클래스는 하나 이상의 추상 메서드를 가질 수 있습니다.
// 구현된 메서드 포함 가능: 추상 클래스는 구체적으로 구현된 메서드도 포함할 수 있습니다.
// 상속을 통해 사용: 추상 클래스는 반드시 하위 클래스에서 **구현(override)**되어야 합니다.
// 추상 클래스의 추상 메서드는 반드시 하위 클래스에서 오버라이딩(override)되어야 한다는 말은, 추상 메서드를 구현하지 않고서는 컴파일이 불가능하다는 의미입니다. 

// 추상 메서드의 특징
// 구현 없음: 메서드 본문(몸체 {})이 없습니다.
// 추상 클래스에만 존재: 추상 메서드는 추상 클래스 또는 인터페이스 내에만 선언될 수 있습니다.
// 하위 클래스에서 구현 필수: 추상 메서드는 상속받은 클래스에서 반드시 **구현(override)**해야 합니다.

// 구현 = 구체화!

// 추상 클래스에서 구현된 메서드와 추상 메서드의 공존 가능!
// 인터페이스에 선언된 모든 필드는 명시적으로 선언하지 않아도 자동으로 public static final로 간주됩니다. 즉, 다음 두 선언은 동일합니다:
// 인터페이스의 필드는 초기화 없이 선언할 수 없습니다. 다음 코드는 컴파일 에러를 발생시킵니다
// 추상 메서드에서 abstract 키워드는 인터페이스 내에서는 생략 가능합니다.
