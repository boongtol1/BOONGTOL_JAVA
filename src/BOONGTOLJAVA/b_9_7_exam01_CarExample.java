package BOONGTOLJAVA;

public class b_9_7_exam01_CarExample {
    public static void main(String[] args) {
		//Car 객체 생성
		b_9_7_exam01_Car car = new b_9_7_exam01_Car();
		
		//익명 자식 객체가 대입된 필드 사용
		car.run1();
			
		//익명 자식 객체가 대입된 로컬변수 사용
		car.run2();
		
		//익명 자식 객체가 대입된 매개변수 사용
		car.run3(new b_9_7_exam01_Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
			}
		});
	}
}
