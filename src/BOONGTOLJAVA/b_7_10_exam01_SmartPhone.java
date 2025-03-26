package BOONGTOLJAVA;

public class b_7_10_exam01_SmartPhone extends b_7_10_exam01_Phone {
    //생성자 선언
	b_7_10_exam01_SmartPhone(String owner) {
		//Phone 생성자 호출
		super(owner);
	}

	//메소드 선언
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
