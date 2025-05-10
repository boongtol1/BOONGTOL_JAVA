package BOONGTOLJAVA;

public interface b_8_5_RemoteControl {
    //상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	//디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			//추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}

// 디폴트 메서드 (default method):

// default 키워드를 사용해 인터페이스에 구현된 메서드를 정의할 수 있습니다.
// 구현 클래스는 필요에 따라 오버라이딩할 수 있습니다.
// 정적 메서드 (static method):

// static 키워드를 사용해 인터페이스에 정적 메서드를 정의할 수 있습니다.
// 인터페이스 이름으로 직접 호출하며, 구현 클래스는 상속받거나 재정의할 수 없습니다.
// cf) static 이 없으면 무조건 인스턴스 맴버!