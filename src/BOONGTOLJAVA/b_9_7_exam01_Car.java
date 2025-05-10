package BOONGTOLJAVA;

public class b_9_7_exam01_Car {
    //필드에 Tire 객체 대입
	private b_9_7_exam01_Tire tire1 = new b_9_7_exam01_Tire();

	//필드에 익명 자식 객체 대입
	private b_9_7_exam01_Tire tire2 = new b_9_7_exam01_Tire() {
		@Override
		public void roll() {            
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");  // b_9_7_exam01_Tire의 익명 자식 클래스의 객체를 tire2 에 저장해라! 
		}
	};

	//메소드(필드 이용)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}

	//메소드(로컬 변수 이용)
	public void run2() {
		//로컬 변수에 익명 자식 객체 대입
		b_9_7_exam01_Tire tire = new b_9_7_exam01_Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
			}
		};
		tire.roll();
	}

	//메소드(매개변수 이용)
	public void run3(b_9_7_exam01_Tire tire) {
		tire.roll();
	}
}

// 익명 클래스는 부모 클래스나 인터페이스를 상속하거나 구현하여 이름 없이 새 클래스를 정의합니다.
// new b_9_7_exam01_Tire() 뒤에 { ... }를 붙이면, b_9_7_exam01_Tire를 상속하는 자식 클래스를 즉석에서 정의하는 것입니다.
// 이 클래스는 이름이 없기 때문에 "익명 클래스" 라고 합니다.
// Java에서는 익명 클래스는 항상 어떤 클래스의 자식 클래스나 인터페이스의 구현체로 만들어집니다.
// 완전히 새로운 독립적인 익명 클래스를 만드는 것은 Java 문법적으로 불가능합니다.
// 네, 익명 자식 클래스(anonymous subclass) 는 객체 생성이 필수입니다.
// Java의 익명 클래스 문법은 객체를 생성하면서 동시에 클래스 정의를 작성하는 방식으로 설계되어 있습니다.
// 따라서 익명 클래스는 객체 없이 정의만 할 수는 없습니다.
// 네, 익명 자식 객체의 중괄호 {} 안에 메서드 오버라이딩을 해야만 익명 자식 클래스에서 메서드의 동작을 변경할 수 있습니다. 이유는 다음과 같습니다.
// 익명 클래스는 이름이 없는 자식 클래스를 정의하면서 객체를 생성하는 구조입니다.
// 중괄호 {} 안은 해당 익명 자식 클래스의 본체를 정의하는 부분입니다.