package BOONGTOLJAVA;

public class b_6_8_exam03_CarExample {
    public static void main(String[] args) {
		//Car 객체 생성
		b_6_8_exam03_Car myCar = new b_6_8_exam03_Car();

		//리턴값이 없는 setGas() 메소드 호출
		myCar.setGas(5);

		//isLeftGas() 메소드를 호출해서 받은 리턴값이 true일 경우 if 블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			//리턴값이 없는 run() 메소드 호출
			myCar.run();
		}
		
		System.out.println("gas를 주입하세요.");
	}
}
