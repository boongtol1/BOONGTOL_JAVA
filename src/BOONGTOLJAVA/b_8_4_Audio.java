package BOONGTOLJAVA;

public class b_8_4_Audio implements b_8_4_RemoteControl{
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
		if(volume>b_8_4_RemoteControl.MAX_VOLUME) {
			this.volume = b_8_4_RemoteControl.MAX_VOLUME;
		} else if(volume<b_8_4_RemoteControl.MIN_VOLUME) {
			this.volume = b_8_4_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
}

// 인터페이스의 자식을 만들때 implements 라는 키워드사용!--> 더 확장된 버전은 사진 참고!