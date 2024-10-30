package BOONGTOLJAVA.b_6_13_exam03_package1;

public class b_6_13_exam03_package1_A {
    //public 접근 제한을 갖는 필드 선언
	public int field1;
	//default 접근 제한을 갖는 필드 선언
	int field2;
	//private 접근 제한을 갖는 필드 선언
	private int field3;

	//생성자 선언
	public b_6_13_exam03_package1_A() {
		field1 = 1; 		//o
		field2 = 1; 		//o
		field3 = 1; 		//o

		method1(); 			//o
		method2(); 			//o
		method3(); 			//o
	}

	//public 접근 제한을 갖는 메소드 선언
	public void method1() {
	}
	
	//default 접근 제한을 갖는 메소드 선언
	void method2() {
	}
	
	//private 접근 제한을 갖는 메소드 선언
	private void method3() {
	}
}

// 자바에서 클래스가 메모리에 로드될 때, 해당 클래스의 모든 메서드는 동시에 인식됩니다.