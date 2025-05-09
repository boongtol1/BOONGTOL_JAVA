package BOONGTOLJAVA;

public class b_8_10_exam01_PromotionExample {
    public static void main(String[] args) {
		//구현 객체 생성
		b_8_10_exam01_B b = new b_8_10_exam01_B();
		b_8_10_exam01_C c = new b_8_10_exam01_C();
		b_8_10_exam01_D d = new b_8_10_exam01_D();
		b_8_10_exam01_E e = new b_8_10_exam01_E();

		//인터페이스 변수 선언
		b_8_10_exam01_A a;

		//변수에 구현 객체 대입
		a = b; //A <-- B (자동 타입 변환)
		a = c; //A <-- C (자동 타입 변환)
		a = d; //A <-- D (자동 타입 변환)
		a = e; //A <-- E (자동 타입 변환)
	}
}
