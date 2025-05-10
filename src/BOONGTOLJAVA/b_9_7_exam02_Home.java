package BOONGTOLJAVA;

public class b_9_7_exam02_Home {
    //필드에 익명 구현 객체 대입
	private b_9_7_exam02_RemoteControl rc = new b_9_7_exam02_RemoteControl() {  // b_9_7_exam02_RemoteControl 인터페이스로 객체를 만든다(X)
		@Override          // b_9_7_exam02_RemoteControl 인터페이스를 구현한 클래스를 {}안에 정의하고 이 익명 클래스를 가지고 객체를 만들어서 rc 에 대입한다!(O)
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
		
	//메소드(필드 이용)
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드(로컬 변수 이용)
	public void use2() {
		//로컬 변수에 익명 구현 객체 대입
		b_9_7_exam02_RemoteControl rc = new b_9_7_exam02_RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드(매개변수 이용)
	public void use3(b_9_7_exam02_RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
