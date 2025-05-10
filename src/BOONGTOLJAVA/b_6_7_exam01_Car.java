package BOONGTOLJAVA;

public class b_6_7_exam01_Car {
    
    b_6_7_exam01_Car(String model, String color, int maxSpeed) {
        
	}
}
// 생성자에서 this.model을 사용해 값을 할당하려고 하지만, 클래스 내부에 model이라는 필드가 선언되어 있지 않으므로 컴파일 오류가 발생합니다.
// 필드란?--> 스크린샷 참고!
// 이 코드의 상태는?--> 생성자가 초기화 작업은 안하고 매개변수로 받는 작업만 해논 것!
// 현재 코드에서는 생성자가 매개변수를 받아오는 작업만 수행하고 있으며, 객체의 상태를 초기화하지 않고 있습니다.