package BOONGTOLJAVA;

public class b_6_14_Car {
    	//필드 선언
	private int speed;
	private boolean stop;
	public int boongtol;

	//speed 필드의 Getter/Setter 선언
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	//stop 필드의 Getter/Setter 선언
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}

// 즉, 자바에서 클래스가 로드되면 그 클래스의 메서드들과 필드들은 클래스를 인식하는 순간 함께 인식된다고 볼 수 있습니다.

// Java에서 모든 인스턴스 필드에 대해 this를 생략할 수 있는 이유는, 클래스 내에서 필드를 사용할 때 기본적으로 현재 인스턴스의 필드로 해석되기 때문입니다.(인스턴스 필드의 역할은 다양하지 않다!)

// 즉, 클래스 내부에서 필드명을 직접 사용할 경우, Java 컴파일러는 자동으로 해당 필드가 현재 인스턴스의 필드임을 인식합니다.

// Getter와 Setter 메서드는 자바에서 클래스의 초기화변수의 필드를 쓰고 수정하기 위해 사용하는 메서드입니다.

// 자바에서는 클래스의 인스턴스 필드를 선언할 때, 초기화하지 않더라도 각 필드는 자동으로 기본값을 가집니다.

// 네, 일반적으로 자바에서 클래스의 필드를 읽거나 수정하기 위해 사용하는 메서드는 **Getter**와 **Setter라고 부릅니다.

// 인스턴스 필드 = 인스턴스의 필드!