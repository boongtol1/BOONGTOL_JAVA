package BOONGTOLJAVA;

public class b_6_9_Car {
    String model;
	int speed;

	//생성자 선언
	b_6_9_Car(String model) {
		this.model = model; //매개변수를 필드에 대입(this 생략 불가)
	}
	
	//메소드 선언
	void setSpeed(int speed) {	// 생성자가 아닌 메서드도 초기화 작업 가능!!!
		this.speed = speed; //매개변수를 필드에 대입(this 생략 불가)
	}

	void run() {
		this.setSpeed(100);	// 현재 객체의 setSpeed 메서드에 100을 입력해라!!
		System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
	}
}
