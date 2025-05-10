package BOONGTOLJAVA;

public class b_4_8_ContinueExample {
    public static void main(String[] args) throws Exception {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
}
}
// 자바에서 continue 구문은 반복문 내에서 사용되는 제어문으로, 특정 조건을 만족할 때 해당 반복의 나머지 코드를 건너뛰고 다음 반복으로 이동하도록 합니다.