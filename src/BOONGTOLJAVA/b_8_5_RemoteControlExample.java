package BOONGTOLJAVA;

public class b_8_5_RemoteControlExample {
    public static void main(String[] args) {
		//인터페이스 변수 선언
		b_8_5_RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new b_8_5_Television();
		rc.turnOn();
		rc.setVolume(5);

		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new b_8_5_Audio();
		rc.turnOn();
		rc.setVolume(5);

		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);				
	}
}
