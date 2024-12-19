package BOONGTOLJAVA;

public class b_7_7_exam02_ChildExample {
    public static void main(String[] args) {
		//자식 객체 생성
		b_7_7_exam02_Child child = new b_7_7_exam02_Child(); // b_7_7_exam02_Child 라는 클래스의 객체를 만들어서 b_7_7_exam02_Child 라는 데이터 타입 변수인 child 에 저장한다!

		//자동 타입 변환
		b_7_7_exam02_Parent parent = child;  // 집합의 포함관계로 생각하기!--> 더 작은 포함관계에 놓인 집합은 더 큰 포함관계에 놓인 집합으로 형 변환 가능하다!!! by 변수 할당!(넘치는지 봐야한다!)
		//메소드 호출
		parent.method1();
		parent.method2();
		//parent.method3(); (호출 불가능)
	}
}
