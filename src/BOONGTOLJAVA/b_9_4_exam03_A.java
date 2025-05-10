package BOONGTOLJAVA;

public class b_9_4_exam03_A {
    //메소드
	public void method1(int arg) { 					//final int arg
		//로컬 변수 
		int var = 1; 						 		//final int var = 1;
		
		//로컬 클래스
		class B {
			//메소드
			void method2() {
				//로컬 변수 읽기
				System.out.println("arg: " + arg);		//(o)
				System.out.println("var: " + var);		//(o)
				
				//로컬 변수 수정
				//arg = 2;									      //(x)
				//var = 2;									      //(x)
			}
		}
		
		//로컬 객체 생성
		B b = new B();
		//로컬 객체 메소드 호출
		b.method2();
		
		//로컬 변수 수정
		//arg = 3;											      //(x)
		//var = 3;											      //(x)
	}
}
// 지역 변수(매개변수 포함)가 로컬 클래스에서 사용되면, 이 변수들은 final 성질을 갖습니다.
// 이는 명시적으로 final로 선언하거나, 컴파일러가 effectively final로 간주함으로써 강제됩니다.