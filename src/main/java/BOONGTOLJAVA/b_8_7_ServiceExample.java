package BOONGTOLJAVA;

public class b_8_7_ServiceExample {
    public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		b_8_7_Service service = new b_8_7_ServiceImpl();

		//디폴트 메소드 호출
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();

		//정적 메소드 호출
		b_8_7_Service.staticMethod1();
		System.out.println();
		b_8_7_Service.staticMethod2();
		System.out.println();
	}
}
