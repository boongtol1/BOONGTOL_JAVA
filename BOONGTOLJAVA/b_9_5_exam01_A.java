package BOONGTOLJAVA;

public class b_9_5_exam01_A {
    	//b_9_5_exam01_A의 인스턴스 필드와 메소드
	int field1;
	void method1() { }

	//A의 정적 필드와 메소드
	static int field2;
	static void method2() { }

	//인스턴스 멤버 클래스
	class B {
		void method() {
			//A의 인스턴스 필드와 메소드 사용
			field1 = 10;			//(o)
			method1();			  //(o)		
			//A의 정적 필드와 메소드 사용
			field2 = 10;			//(o)
			method2();			  //(o)
		}
	}

	//정적 멤버 클래스
	static class C {
		void method() {
			//A의 인스턴스 필드와 메소드 사용
			//field1 = 10;		//(x)
			//method1();			//(x)
			//A의 정적 필드와 메소드 사용
			field2 = 10;			//(o)
			method2();			  //(o)
		}
	}
}
// 인스턴스 멤버 클래스와 정적 멤버 클래스 접근가능:불가능한 것.png 사진 참고!