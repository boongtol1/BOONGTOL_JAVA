package BOONGTOLJAVA;

public class b_4_4_FloatCounterExample {
    public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}
}

// 자바의 System.out.println() 함수는 기본적으로 사람이 보기 좋은 방식으로 값을 출력합니다. 
// 자바에서 기본적으로 제공하는 출력 방식은 소수점 이하의 자리를 자동으로 조정하여, 너무 작은 오차는 표시되지 않도록 설계되어 있습니다.