package BOONGTOLJAVA;

public class b_7_3_exam02_SmartPhone extends b_7_3_exam02_Phone {
    //자식 생성자 선언
	public b_7_3_exam02_SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
