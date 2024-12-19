package BOONGTOLJAVA;

public class b_8_6_Television implements b_8_6_RemoteControl {
    //필드
	private int volume;

	//turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	//turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	//setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume>b_8_6_RemoteControl.MAX_VOLUME) {
			this.volume = b_8_6_RemoteControl.MAX_VOLUME;
		} else if(volume<b_8_6_RemoteControl.MIN_VOLUME) {
			this.volume = b_8_6_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
