package BOONGTOLJAVA;

public class b_6_8_exam03_Car {
    //필드 선언
	int gas;

	//리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
	void setGas(int gas) {
		this.gas = gas;	// 이 초기화를 수행하기 위한 사전준비?--> 필드 선언!
	}

	//리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
	boolean isLeftGas() {
		if (this.gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false를 리턴하고 메소드 종료
		}
		System.out.println("gas가 있습니다.");
		return true; // true를 리턴하고 메소드 종료
	}

	//리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 종료
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; // 메소드 종료
			}
		}
	}
}
// 자바에서 필드 참조 (this 생략 가능) 14행! 
// 클래스 내에서는 self. ... 이고 객체 생성해서는 객체이름. ...  인것 기억하자! 자바에서는 self 대신 this 키워드 사용!
// 초기화를 진행하고 초기화 변수(여기서는 this.gas)를 사용하고 싶을때?--> this. ... or just ... only 가능! 즉 this. 생략 가능!--> 클래스 내에서 not 객체 만든 후! 객체 만든 후는 객체이름. ...이다!
// 일단 파이썬과 비교해가면서 하기!!!
// 생성자가 아닌 일반 메서드들도 초기화 작업이 가능하다!!!
// 인스턴스 메서드는 해당 클래스의 인스턴스 필드에 접근할 수 있습니다.--> 인스턴스 메서드 , 인스턴스 필드와 아직 익숙하지는 않지만 일단 넘어간다!--> 인스턴스가 아닌 메서드,필드를 생각하게될때 다시 공부하기!
// this.gas는 현재 객체의 gas 필드를 참조합니다.
// this는 현재 인스턴스의 참조로, 클래스 내의 모든 인스턴스 메서드에서 this.gas를 사용할 수 있습니다.
// 초기화 변수의 필드가 일반적인 필드보다 범위가 좁다!