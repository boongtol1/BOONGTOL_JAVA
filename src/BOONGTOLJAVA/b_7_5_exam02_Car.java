package BOONGTOLJAVA;

public class b_7_5_exam02_Car {
    //필드 선언
	public int speed;

	//메소드 선언
	public void speedUp() {
		speed += 1;
	}

	//final 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
// final로 선언된 메서드는 하위 클래스에서 재정의(오버라이딩)할 수 없습니다. 이는 메서드의 동작이 변경되지 않도록 보장하기 위해 사용됩니다.