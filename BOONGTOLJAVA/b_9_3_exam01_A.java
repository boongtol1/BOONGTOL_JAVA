package BOONGTOLJAVA;

public class b_9_3_exam01_A {
    // 정적(클래스) 멤버 클래스
	static class B {}

	//인스턴스 필드 값으로 B 객체 대입
	B field1 = new B();

	//정적 필드 값으로 B 객체 대입
	static B field2 = new B();

	//생성자
	b_9_3_exam01_A() {
		B b = new B();
	}

	//인스턴스 메소드
	void method1() {
		B b = new B();
	}

	//정적 메소드
	static void method2() {
		B b = new B();
	}
}
