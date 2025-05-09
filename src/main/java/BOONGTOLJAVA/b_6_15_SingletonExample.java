package BOONGTOLJAVA;

public class b_6_15_SingletonExample {
    public static void main(String[] args) {
		/*
 		Singleton obj1 = new Singleton(); //컴파일 에러
 		Singleton obj2 = new Singleton(); //컴파일 에러
		 */
		
		//정적 메소드를 호출해서 싱글톤 객체 얻음
		b_6_15_Singleton obj1 = b_6_15_Singleton.getInstance();
		b_6_15_Singleton obj2 = b_6_15_Singleton.getInstance();

		//동일한 객체를 참조하는지 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}

// 자바에서 객체는 데이터 타입이 될 수 없습니다. 대신, 클래스가 데이터 타입이 됩니다.
