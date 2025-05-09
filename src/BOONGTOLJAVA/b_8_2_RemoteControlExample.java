package BOONGTOLJAVA;

public class b_8_2_RemoteControlExample {
    public static void main(String[] args) {
		b_8_2_RemoteControl rc;

		//rc 변수에 Television 객체를 대입
		rc = new b_8_2_Television();
		rc.turnOn();
		
		//rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new b_8_2_Audio();
		rc.turnOn();
	}
}
// b_8_2_RemoteControl rc;는 인터페이스 타입 변수:
// rc는 b_8_2_RemoteControl을 구현한 클래스의 객체를 참조할 수 있는 변수입니다.
// 네, **rc = new b_8_2_Television();와 rc = new b_8_2_Audio();는 다형성(Polymorphism)**의 대표적인 예입니다.
// Java에서 다형성은 같은 타입의 변수(인터페이스 또는 부모 클래스 타입)가 다양한 형태의 객체(자기자신 or 자식들)를 참조할 수 있는 능력을 말합니다.
// 인터페이스 타입 변수(b_8_2_RemoteControl rc)는 인터페이스에 선언된 메서드만 호출할 수 있습니다.