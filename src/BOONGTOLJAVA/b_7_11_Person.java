package BOONGTOLJAVA;

public sealed class b_7_11_Person permits b_7_11_Employee, b_7_11_Manager {
    //필드
	public String name;

	//메소드
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}
// b_7_11_Person 클래스는 부모 클래스 역할을 하며, 직접 객체를 생성할 수 있습니다.
// 직접 객체를 생성할 수 있습니다"**는 b_7_11_Person 클래스가 추상 클래스가 아니므로 객체를 생성하는 데 제약이 없음을 의미합니다.
// 상속을 허용한 클래스만 b_7_11_Person을 상속받을 수 있습니다.