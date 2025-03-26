package BOONGTOLJAVA;

public class b_3_1_IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
		int x = 10;  // 변수 x에 10을 할당
		int y = 10;  // 변수 y에 10을 할당
		int z;       // 변수 z를 선언 (초기값 없음)
		
		x++;         // x를 1 증가시킴 (x는 이제 11)
		++x;         // x를 다시 1 증가시킴 (x는 이제 12)
		System.out.println("x=" + x);  // x의 값(12)을 출력
		
		System.out.println("-----------------------");		
		y--;         // y를 1 감소시킴 (y는 이제 9)
		--y;         // y를 다시 1 감소시킴 (y는 이제 8)
		System.out.println("y=" + y);  // y의 값(8)을 출력

		System.out.println("-----------------------");		
		z = x++;     // z에 x의 현재 값(12)을 할당한 후 x를 1 증가시킴 (x는 이제 13)
		System.out.println("z=" + z);  // z의 값(12)을 출력
		System.out.println("x=" + x);  // x의 값(13)을 출력
		
		System.out.println("-----------------------");		
		z = ++x;     // x를 먼저 1 증가시킨 후 (x는 이제 14) 그 값을 z에 할당
		System.out.println("z=" + z);  // z의 값(14)을 출력
		System.out.println("x=" + x);  // x의 값(14)을 출력
		
		System.out.println("-----------------------");				
		z = ++x + y++; // x를 먼저 1 증가시킨 후 (x는 이제 15) 그 값과 y의 현재 값(8)을 더한 값을 z에 할당 후 y를 1 증가시킴 (y는 이제 9)
		System.out.println("z=" + z);  // z의 값(23)을 출력 (15 + 8)
		System.out.println("x=" + x);  // x의 값(15)을 출력
		System.out.println("y=" + y);  // y의 값(9)을 출력
	}
}
