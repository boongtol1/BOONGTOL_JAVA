package BOONGTOLJAVA;

public class b_8_4_RemoteControlExample {
    public static void main(String[] args) {
		//인터페이스 변수 선언
		b_8_4_RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new b_8_4_Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new b_8_4_Audio();
		rc.turnOn();
		rc.setVolume(77);
		rc.turnOff();
	}
}
