package BOONGTOLJAVA;

public class b_6_14_Car {
    	//필드 선언
	private int speed;
	private boolean stop;
	
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

// 이 소스코드를 모두 인식하고 speed 와 stop 필드를 인식했을때, 이들은 영원히 현재 객체의 필드로 영원히 역할이 주어진다. 
// 이렇게 역할이 주어져 있을때 this. 을 생략 가능하다!!

// 네, this.speed = 0;와 this.stop = stop;와 같은 코드가 전체 코드 내에 포함되어 있기 때문에 speed와 stop 필드가 해당 객체의 필드로서 명확하게 역할을 수행하게 됩니다.

// 만약 speed 와 stop 필드가 현재 객체의 필드로 영원히 역할이 주어지지 않은 상태라면 this. 을 써서는 안된다!! 그냥 speed 나 stop 과 같이 아무것도 붙이지 말고 생으로 써야 한다!!

// Getter와 Setter 메서드는 자바에서 클래스의 초기화변수의 필드를 쓰고 수정하기 위해 사용하는 메서드입니다.

// 자바에서는 클래스의 인스턴스 필드를 선언할 때, 초기화하지 않더라도 각 필드는 자동으로 기본값을 가집니다.

// 네, 일반적으로 자바에서 클래스의 필드를 읽거나 수정하기 위해 사용하는 메서드는 **Getter**와 **Setter라고 부릅니다.