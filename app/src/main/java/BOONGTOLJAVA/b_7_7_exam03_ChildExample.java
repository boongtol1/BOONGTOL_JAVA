package BOONGTOLJAVA;

public class b_7_7_exam03_ChildExample {
    public static void main(String[] args) {
		//객체 생성 및 자동 타입 변환
		b_7_7_exam03_Parent parent = new b_7_7_exam03_Child();		// 이 코드는 **객체 생성과 자동 타입 변환(Promotion)**을 한 번에 수행한 것입니다.
																	// b_7_7_exam03_Child 라는 클래스의 객체를 만들어서 b_7_7_exam03_Parent(클래스) 라는 데이터 타입의 변수 parent 에 저장한다!(넘치는지 봐야한다! & 순서를 나누어라!)
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";	
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2";      	//(불가능)
		parent.method3();         		//(불가능)
		*/
		
		//강제 타입 변환
		b_7_7_exam03_Child child = (b_7_7_exam03_Child) parent;
		
		//Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";  		//(가능)
		child.method3();     			//(가능)
	}
}
// 네, 맞습니다! **강제 타입 변환(Casting)**도 **집합의 포함 관계(상속 관계)**가 성립해야만 가능합니다.
// 강제 타입 변환은 자식 클래스의 객체를 잠시 부모 클래스 타입으로 보았다가, 다시 원래의 자식 클래스 타입으로 되돌리는 것"**입니다.