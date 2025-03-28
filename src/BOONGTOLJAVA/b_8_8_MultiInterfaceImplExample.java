package BOONGTOLJAVA;

public class b_8_8_MultiInterfaceImplExample {
    public static void main(String[] args) {
		//RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		b_8_8_RemoteControl rc = new b_8_8_SmartTelevision();
		//RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
		rc.turnOn();
		rc.turnOff();		
		//Searchable 인터페이스 변수 선언 및 구현 객체 대입
		b_8_8_Searchable searchable = new b_8_8_SmartTelevision();
		//Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
		searchable.search("https://www.youtube.com");
	}
}
