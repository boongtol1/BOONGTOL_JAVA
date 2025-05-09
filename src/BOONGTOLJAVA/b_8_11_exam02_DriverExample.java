package BOONGTOLJAVA;

public class b_8_11_exam02_DriverExample {
    public static void main(String[] args) {
		//Driver 객체 생성
		b_8_11_exam02_Driver driver = new b_8_11_exam02_Driver();

		//Vehicle 구현 객체 생성
		b_8_11_exam02_Bus bus = new b_8_11_exam02_Bus();
		b_8_11_exam02_Taxi taxi = new b_8_11_exam02_Taxi();

		//매개값으로 구현 객체 대입(다형성: 실행 결과가 다름)
		driver.drive(bus);
		driver.drive(taxi);
	}
}
// 다형성은 "하나의 부모 클래스 타입 변수를 통해 다양한 (자식 or 자신) 클래스의 객체를 다룰 수 있는 능력"을 의미합니다.