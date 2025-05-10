package BOONGTOLJAVA;

public class b_9_7_exam03_ButtonExample {
    public static void main(String[] args) {
		//Ok 버튼 객체 생성
		b_9_7_exam03_Button btnOk = new b_9_7_exam03_Button();

		//Ok 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new b_9_7_exam03_Button.ClickListener() {
			@Override   // 네, 익명 클래스 객체는 ClickListener 인터페이스 형태로 취급됩니다.(in 매개변수 전달시!)
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		});

		//Ok 버튼 클릭하기
		btnOk.click();

		//----------------------------------------------------------------------------

		//Cancel 버튼 객체 생성
		b_9_7_exam03_Button btnCancel = new b_9_7_exam03_Button();

		//Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new b_9_7_exam03_Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		});

		//Cancel 버튼 클릭하기
		btnCancel.click();
	}
}
