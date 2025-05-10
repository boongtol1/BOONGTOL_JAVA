package BOONGTOLJAVA;

public class b_8_11_exam01_Car {
    //필드
	b_8_11_exam01_Tire tire1 = new b_8_11_exam01_HankookTire();
	b_8_11_exam01_Tire tire2 = new b_8_11_exam01_HankookTire();

	//메소드
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
// 다형성은 "하나의 부모 클래스 타입 변수를 통해 다양한 (자식 or 자신) 클래스의 객체를 다룰 수 있는 능력"을 의미합니다.