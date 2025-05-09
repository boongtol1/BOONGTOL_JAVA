package BOONGTOLJAVA.b_6_13_exam02_package1;

public class b_6_13_exam02_package1_A {
    //필드 선언
	b_6_13_exam02_package1_A a1 = new b_6_13_exam02_package1_A(true);
	b_6_13_exam02_package1_A a2 = new b_6_13_exam02_package1_A(1);
	b_6_13_exam02_package1_A a3 = new b_6_13_exam02_package1_A("문자열");

	//public 접근 제한 생성자 선언
	public b_6_13_exam02_package1_A(boolean b) {
	}
	
	//default 접근 제한 생성자 선언
	b_6_13_exam02_package1_A(int b) {
	}

	//private 접근 제한 생성자 선언
	private b_6_13_exam02_package1_A(String s) {
	}
}
