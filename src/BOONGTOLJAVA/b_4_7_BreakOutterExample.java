package BOONGTOLJAVA;

public class b_4_7_BreakOutterExample {
    public static void main(String[] args) throws Exception {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}

// Outter는 자바의 **라벨(label)**을 의미합니다.
// 라벨은 반복문 앞에 붙여서, 해당 반복문을 특정 제어 구문(break, continue)에서 명확하게 참조할 수 있도록 해주는 기능입니다.
// 반복문의 예시 in java--> 1. for 문 , 2.while 문 , 3. do-while 문     
// 이해의 key?--> 반복문을 탈출해서 커서가 바깥으로 간다 의 이해!