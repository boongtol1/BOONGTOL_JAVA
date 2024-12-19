package BOONGTOLJAVA;

public class b_9_6_exam01_Button {
    //정적 멤버 인터페이스
	public static interface ClickListener {
		//추상 메소드
		void onClick();
	}
}
// Java에서 클래스 내부에 선언된 인터페이스는 기본적으로 정적 멤버로 간주됩니다.
// 따라서 static 키워드를 명시하지 않아도 동일하게 작동합니다.