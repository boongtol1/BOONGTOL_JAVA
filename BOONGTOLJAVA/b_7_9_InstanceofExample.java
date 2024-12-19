package BOONGTOLJAVA;

public class b_7_9_InstanceofExample {
    //main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(b_7_9_Person person) {
		System.out.println("name: " + person.name);
		person.walk();

		//person이 참조하는 객체가 Student 타입인지 확인
		if (person instanceof b_7_9_Student) {
 			//Student 객체일 경우 강제 타입 변환
 			b_7_9_Student student = (b_7_9_Student) person;
 			//Student 객체만 가지고 있는 필드 및 메소드 사용
 			System.out.println("studentNo: " + student.studentNo);
 			student.study();
 		}

		//person이 참조하는 객체가 Student 타입일 경우
		//student 변수에 대입(타입 변환 발생)
		if(person instanceof b_7_9_Student student) {  // 조건이 참이면, person이 자동으로 b_7_9_Student 타입으로 변환되고, 변환된 객체가 student 변수에 저장됩니다.
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
	}

	public static void main(String[] args) {
		//Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		b_7_9_Person p1 = new b_7_9_Person("홍길동");
		personInfo(p1);
		
		System.out.println();

		//Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		b_7_9_Person p2 = new b_7_9_Student("김길동", 10);
		personInfo(p2);
	}
}
