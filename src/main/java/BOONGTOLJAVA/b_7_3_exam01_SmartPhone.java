package BOONGTOLJAVA;

public class b_7_3_exam01_SmartPhone extends b_7_3_exam01_Phone {
    public b_7_3_exam01_SmartPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}

// 네, super()는 자식 클래스에서 바로 한 단계 위의 부모 클래스의 생성자를 호출합니다.
// public 멤버는 자식 클래스에 모두 상속됩니다.
// 자식 클래스는 부모의 public 필드와 메서드를 그대로 사용하거나, 재정의(메서드)하거나, 숨기기(필드)할 수 있습니다. / 메서드 오바라이딩하면 오버라이딩 하기 전의 메서드는 호출 불가! But 필드 숨기기는 super 을 통해 접근 가능!
// 생성자는 상속되지 않으며, 자식 클래스에서 필요하면 명시적으로 호출해야 합니다.
// 상속받은 멤버는 부모-자식 간에 공유되므로, 부모 클래스의 상태 변화가 자식 클래스에 영향을 미칠 수 있습니다.