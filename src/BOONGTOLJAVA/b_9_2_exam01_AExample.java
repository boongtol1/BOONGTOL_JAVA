package BOONGTOLJAVA;

public class b_9_2_exam01_AExample {
    public static void main(String[] args) {
		//A 객체 생성
		b_9_2_exam01_A a = new b_9_2_exam01_A();

		//B 객체 생성
		b_9_2_exam01_A.B b = a.new B();
	}
}
// a.new B();의 의미는 외부 클래스 a의 객체를 기반으로 내부 클래스 B의 객체를 생성한다는 뜻입니다. 