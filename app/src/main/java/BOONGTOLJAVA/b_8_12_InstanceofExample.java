package BOONGTOLJAVA;

public class b_8_12_InstanceofExample {
    public static void main(String[] args) {
		//구현 객체 생성
		b_8_12_Taxi taxi = new b_8_12_Taxi();
		b_8_12_Bus bus = new b_8_12_Bus();

		//ride() 메소드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
	}
	
	//인터페이스 매개변수를 갖는 메소드
	public static void ride(b_8_12_Vehicle vehicle) {
		//방법1
		if(vehicle instanceof b_8_12_Bus) {
            b_8_12_Bus bus = (b_8_12_Bus) vehicle;
 			bus.checkFare();
 		}

		//방법2
		if(vehicle instanceof b_8_12_Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run();
	}
}

// 조건이 참이면, vehicle이 자동으로 b_8_12_Bus 타입으로 변환되고, 변환된 객체가 bus 변수에 저장됩니다.(24행)