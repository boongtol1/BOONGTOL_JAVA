package BOONGTOLJAVA;

public interface b_8_4_RemoteControl {
    //상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}

