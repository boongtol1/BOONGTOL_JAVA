package BOONGTOLJAVA.b_6_13_exam03_package1;

public class b_6_13_exam03_package1_B {
    public void method() {
		//객체 생성
		b_6_13_exam03_package1_A a = new b_6_13_exam03_package1_A();

		//필드값 변경
		a.field1 = 1; 		// o
		a.field2 = 1; 		// o
		//a.field3 = 1;		// x

		//메소드 호출
		a.method1(); 		// o
		a.method2(); 		// o
		//a.method3(); 		// x
	}
}
