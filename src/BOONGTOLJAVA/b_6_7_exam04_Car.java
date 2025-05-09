package BOONGTOLJAVA;

public class b_6_7_exam04_Car {
    //필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	b_6_7_exam04_Car() {}
	
	b_6_7_exam04_Car(String model) { 
		this.model = model; 
	}
	
	b_6_7_exam04_Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	b_6_7_exam04_Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
// 매개변수의 개수: 객체를 생성할 때 제공하는 매개변수의 개수와 일치하는 생성자가 호출됩니다.--> 제일 우선시됨!
// 매개변수의 타입: 매개변수의 타입이 일치하는 생성자가 호출됩니다.--> 그 다음으로 우선시됨!
// 매개변수 타입의 호환성 확인해서,
// 호환되지 않는 타입이면 타입 변환이 불가능하다 하고, 컴파일 오류가 발생합니다.
// 매개변수의 타입이 서로 다르지만, 서로 호환될때 (자동 타입 변환이 가능한 경우), 가장 좁은 타입에서 넓은 타입으로의 변환이 우선적으로 고려됩니다.
// 한줄 요약 : 여러 후보 생성자 중에서 변환이 가능한 생성자를 비교하여, jvm 이 생각하기에 가장 적합한 생성자를 선택합니다.
// 정리 : 매개변수의 개수가 같고 타입이 같으면?--> 그 생성자를 따라간다!
//       매개변수의 개수가 같고 타입이 다르면?--> 타입이 다를때 호환이 안되면?--> 컴파일 에러! , 호환이 되면?--> 좁은 타입에서 넓은 타입으로의 변환이 이루어짐!
// 여러 생성자 중 자동 변환이 가능한 것이 여러 개 있을 때, 자바는 가장 적은 범위의 변환을 선택합니다. 예를 들어, byte는 int로 변환되지만, double로 변환되지는 않습니다.
// 동일한 매개변수 타입과 개수를 가지는 생성자를 중복 정의하려고 하면 컴파일 오류가 발생합니다.
// 즉, b_6_7_exam04_Car 클래스의 인스턴스를 만들 때마다 이 company 필드는 기본값으로 "현대자동차"로 초기화되지만, 필요하다면 객체별로 값을 변경할 수 있습니다. 각 객체는 이 필드를 독립적으로 관리하게 됩니다.