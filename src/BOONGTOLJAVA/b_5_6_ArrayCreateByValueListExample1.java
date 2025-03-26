package BOONGTOLJAVA;

public class b_5_6_ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		String[] season = { "Spring", "Summer", "Fall", "Winter" };

		//배열의 항목값 읽기
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);

		//인덱스 1번 항목의 값 변경
		season[1] = "여름";
		System.out.println("season[1] : " + season[1]);
		System.out.println();

		//배열 변수 선언과 배열 생성
		int[] scores = { 83, 90, 87 };

		//총합과 평균 구하기
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}
// 맞습니다. Java에서 배열은 객체입니다. 모든 배열은 객체로 간주되기 때문에, 배열을 생성할 때 일반적으로 new 키워드를 사용해야 합니다. 
// 하지만, Java에서는 특별한 배열 초기화 방법을 제공하여, 특정 경우에는 new 키워드를 명시적으로 사용하지 않고도 배열을 초기화할 수 있습니다.
// 이 때문에 코드가 간결해지고, 가독성이 높아지는 장점이 있습니다.

// 배열 리터럴 {}을 사용할 때는 new 키워드를 생략할 수 있지만, 배열을 선언과 동시에 초기화해야만 합니다.

// int[] scores;
// scores = { 83, 90, 87 };  --> 컴파일 오류 발생!

// 배열 리터럴을 사용할 때 new 키워드를 생략할 수 있는 이유는, Java가 컴파일 시에 내부적으로 new를 자동으로 추가하여 배열 객체를 생성하기 때문입니다.
