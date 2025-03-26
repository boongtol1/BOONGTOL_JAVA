package BOONGTOLJAVA;

public class b_6_15_Singleton {
    	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static b_6_15_Singleton singleton = new b_6_15_Singleton(); // new b_6_15_Singleton()에서 b_6_15_Singleton은 생성자의 이름이 아니라 클래스의 이름입니다.

	//private 접근 권한을 갖는 생성자 선언
	private b_6_15_Singleton() {
	}

	//public 접근 권한을 갖는 정적 메소드 선언
	public static b_6_15_Singleton getInstance() {	// 에서 b_6_15_Singleton는 getInstance 메서드의 반환 타입이다!(b_6_15_Singleton 클래스의 객체) / 참고로 클래스 자체가 반환되는 경우는 없다! 따라서 헷갈리지 않기 가능!
		return singleton;
	}
}

// 네, 객체를 만들려면 자바와 파이썬 모두 생성자를 호출해야 합니다.
// 자바에서는 객체를 생성할 때 반드시 명시적 또는 기본 생성자가 호출됩니다. 만약 클래스에 생성자를 정의하지 않으면, 자바는 기본 생성자(매개변수가 없는 생성자)를 자동으로 제공합니다.

