package BOONGTOLJAVA;

public class b_7_8_exam02_DriverExample {
    public static void main(String[] args) {
		//Driver 객체 생성
		b_7_8_exam02_Driver driver = new b_7_8_exam02_Driver();

		//매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
		b_7_8_exam02_Bus bus = new b_7_8_exam02_Bus();
		driver.drive(bus);

		//매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
		b_7_8_exam02_Taxi taxi = new b_7_8_exam02_Taxi();
		driver.drive(taxi);
	}
}
