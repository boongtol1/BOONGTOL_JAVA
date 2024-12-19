package BOONGTOLJAVA;

public class b_9_6_exam02_Button {
    //정적 멤버 인터페이스
	public static interface ClickListener {
		//추상 메소드
		void onClick();	}
	
	//필드
	private ClickListener clickListener;        // ClickListener 인터페이스 타입의 인스턴스 필드 clickListener 선언함!(만듬!)
		
	//메소드
	public void setClickListener(ClickListener clickListener) { //  ClickListener 인터페이스 타입의 매개변수 clickListener 선언함!
		this.clickListener = clickListener;
	}
}
