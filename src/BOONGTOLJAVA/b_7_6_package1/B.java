package BOONGTOLJAVA.b_7_6_package1;

public class B {
    //메소드 선언
	public void method() {
		A a = new A();		//o
		a.field = "value"; 	//o
		a.method(); 			//o
	}
}
// 서로 다른 두 클래스 각각에서 같은 이름의 메서드를 정의하는 것은 전혀 문제가 없습니다.