package BOONGTOLJAVA;

public class b_7_4_exam02_SupersonicAirplane extends b_7_4_exam02_Airplane{
    //상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	//상태 필드 선언
	public int flyMode = NORMAL;

	//메소드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}
}
// super.fly();는 자바에서 부모 클래스(또는 상위 클래스)의 fly() 메서드를 호출하는 구문입니다.(한단계!)