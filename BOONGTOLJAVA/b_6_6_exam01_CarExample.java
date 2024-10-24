package BOONGTOLJAVA;

public class b_6_6_exam01_CarExample {
    public static void main(String[] args) {
		//Car 객체 생성
		b_6_6_exam01_Car myCar = new b_6_6_exam01_Car();

		//Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
	}
}
