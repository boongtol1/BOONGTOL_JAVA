package BOONGTOLJAVA;

public class b_7_9_Student extends b_7_9_Person{
    //필드 선언
	public int studentNo;

	//생성자 선언
	public b_7_9_Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}

	//메소드 선언
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
