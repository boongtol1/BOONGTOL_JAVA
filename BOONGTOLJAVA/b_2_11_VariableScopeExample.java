package BOONGTOLJAVA;

public class b_2_11_VariableScopeExample {
    public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
		    int v2 = v1 - 10;    // v2 는 if 문 안에서만 인식 가능한 지역변수다 not 전역변수!
		}
		int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}
}
