package BOONGTOLJAVA;

public class b_7_10_exam01_PhoneExample {
    public static void main(String[] args) {
		// b_7_10_exam01_Phone phone = new b_7_10_exam01_Phone();--> 추상메서드는 객체생성 불가!

		b_7_10_exam01_SmartPhone smartPhone = new b_7_10_exam01_SmartPhone("홍길동"); // --> 추상메서드의 자식 클래스는 객체 생성 가능!

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
