package BOONGTOLJAVA;

public class b_6_11_exam01_Korean {
    //인스턴스 final 필드 선언
	final String nation = "대한민국";
	final String ssn;
	
	//인스턴스 필드 선언
	String name;

	//생성자 선언
	public b_6_11_exam01_Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

// final 필드: final로 선언된 필드는 한 번 초기화되면 값을 변경할 수 없습니다. 이를 통해 필드의 값을 불변으로 만들 수 있습니다.