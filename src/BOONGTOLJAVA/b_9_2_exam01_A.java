package BOONGTOLJAVA;

public class b_9_2_exam01_A {
    	//인스턴스 멤버 클래스
	class B {}
	
	//인스턴스 필드 값으로 B 객체 대입
	B field = new B();      // b_9_2_exam01_A 에서 B 라는 클래스 형태의 필드를 선언하고 B 객체를 대입한다!(field 는 b_9_2_exam01_A의 필드다!)
	
	//생성자
	b_9_2_exam01_A() {
		B b = new B();
	}
	
	//인스턴스 메소드
	void method() {
		B b = new B();
	}
}
// B는 외부 클래스 b_9_2_exam01_A의 인스턴스 멤버 클래스입니다.
// **인스턴스 멤버 클래스(Instance Member Class)**는 **외부 클래스의 객체(instance)**에 속합니다.
// 외부 클래스가 생성된 후에만 B 객체를 생성하고 사용할 수 있습니다.
// class B라고 선언했을 때 별도의 접근 제한자를 지정하지 않으면, 기본적으로 default(패키지 접근) 접근 제한자를 갖습니다.
// b 는 메서드 내에서만 유효한 지역 변수다!