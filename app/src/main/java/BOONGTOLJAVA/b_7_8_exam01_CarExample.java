package BOONGTOLJAVA;

public class b_7_8_exam01_CarExample {
    public static void main(String[] args) {
		//Car 객체 생성
		b_7_8_exam01_Car myCar = new b_7_8_exam01_Car();

		//Tire 객체 장착
		myCar.tire = new b_7_8_exam01_Tire();
		myCar.run();

		//HankookTire 객체 장착
		myCar.tire = new b_7_8_exam01_HankookTire();
		myCar.run();

		//KumhoTire 객체 장착
		myCar.tire = new b_7_8_exam01_KumhoTire();
		myCar.run();
	}
}
// tire 필드에 b_7_8_exam01_Tire 클래스와 이를 상속하는 모든 하위 클래스의 객체를 대입할 수 있습니다.
// 다형성은 "하나의 부모 클래스 타입 변수를 통해 다양한 (자식 or 자신) 클래스의 객체를 다룰 수 있는 능력"을 의미합니다.