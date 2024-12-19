package BOONGTOLJAVA;

public class b_8_11_exam01_CarExample {
    public static void main(String[] args) {
		//자동차 객체 생성
		b_8_11_exam01_Car myCar = new b_8_11_exam01_Car();

		//run() 메소드 실행
		myCar.run();

		//타이어 객체 교체
		myCar.tire1 = new b_8_11_exam01_KumhoTire();
		myCar.tire2 = new b_8_11_exam01_KumhoTire();

		//run() 메소드 실행(다형성: 실행 결과가 다름)
		myCar.run();
	}
}

// 다형성은 "하나의 부모 클래스 타입 변수를 통해 다양한 (자식 or 자신) 클래스의 객체를 다룰 수 있는 능력"을 의미합니다.