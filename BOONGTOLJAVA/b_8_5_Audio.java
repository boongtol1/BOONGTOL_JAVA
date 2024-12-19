package BOONGTOLJAVA;

public class b_8_5_Audio implements b_8_5_RemoteControl{
    //필드
	private int volume;

	//turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	//turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	//setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume>b_8_5_RemoteControl.MAX_VOLUME) {
			this.volume = b_8_5_RemoteControl.MAX_VOLUME;
		} else if(volume<b_8_5_RemoteControl.MIN_VOLUME) {
			this.volume = b_8_5_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

	//필드
	private int memoryVolume;

	//디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(b_8_5_RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
}
