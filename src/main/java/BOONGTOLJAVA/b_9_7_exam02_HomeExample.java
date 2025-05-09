package BOONGTOLJAVA;

public class b_9_7_exam02_HomeExample {
    public static void main(String[] args) {
		//Home 객체 생성
		b_9_7_exam02_Home home = new b_9_7_exam02_Home();

		//익명 구현 객체가 대입된 필드 사용
		home.use1();
		
		//익명 구현 객체가 대입된 로컬 변수 사용
		home.use2();

		//익명 구현 객체가 대입된 매개변수 사용
		home.use3(new b_9_7_exam02_RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("난방을 끕니다.");
			}
		});
	}
}
