package BOONGTOLJAVA;

public class b_9_4_exam01_A {
    //생성자
	b_9_4_exam01_A() {
		//로컬 클래스 선언
		class B { }

		//로컬 객체 생성
		B b = new B();
	}

	//메소드
	void method() {
		//로컬 클래스 선언
		class B { }

		//로컬 객체 생성
		B b = new B();
	}
}

// 로컬 클래스란?
// 메서드(또는 생성자) 내부에서 선언된 클래스입니다.
// 해당 메서드 또는 생성자가 실행되는 동안에만 사용 가능합니다.
// 로컬 클래스는 해당 메서드 내부에서만 유효한 **지역적 범위(scope)**를 가집니다.