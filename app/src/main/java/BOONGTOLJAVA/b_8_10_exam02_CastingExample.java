package BOONGTOLJAVA;

public class b_8_10_exam02_CastingExample {
    public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		b_8_10_exam02_Vehicle vehicle = new b_8_10_exam02_Bus();

		//인터페이스를 통해서 호출
		vehicle.run();
		//vehicle.checkFare(); (x)

		//강제 타입 변환후 호출
		b_8_10_exam02_Bus bus = (b_8_10_exam02_Bus) vehicle; 
		bus.run();
		bus.checkFare();
	}
}
