package BOONGTOLJAVA;

public class b_7_3_exam02_SmartPhoneExample {
    public static void main(String[] args) {
		//SmartPhone 객체 생성
		b_7_3_exam02_SmartPhone myPhone = new b_7_3_exam02_SmartPhone("갤럭시", "은색");
		
		//Phone으로부터 상속 받은 필드 읽기
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
	}
}
