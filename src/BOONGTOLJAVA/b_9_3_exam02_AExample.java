package BOONGTOLJAVA;

public class b_9_3_exam02_AExample {
    public static void main(String[] args) {
		//B 객체 생성 및 인스턴스 필드 및 메소드 사용
		b_9_3_exam02_A.B b = new b_9_3_exam02_A.B();
		System.out.println(b.field1);
		b.method1();

		//B 클래스의 정적 필드 및 메소드 사용
		System.out.println(b_9_3_exam02_A.B.field2);
		b_9_3_exam02_A.B.method2();
	}
}
