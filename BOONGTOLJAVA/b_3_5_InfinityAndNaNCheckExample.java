package BOONGTOLJAVA;

public class b_3_5_InfinityAndNaNCheckExample {
    public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		//double z = x % y;
		
		//잘못된 코드
		System.out.println(z + 2);	
		
		//알맞은 코드
		if(Double.isInfinite(z) || Double.isNaN(z)) {   // ||는 자바에서 논리 연산자로 사용되며, **논리적 OR (또는)**를 의미합니다.
			System.out.println("값 산출 불가"); 
		} else { 
			System.out.println(z + 2); 
		}   
	}
}
