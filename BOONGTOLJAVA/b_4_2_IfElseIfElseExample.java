package BOONGTOLJAVA;

public class b_4_2_IfElseIfElseExample {
    public static void main(String[] args) {
		int score = 75;

		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
	}
}
// score >= 80은 score가 80 이상인 모든 경우를 포괄합니다.
// 하지만 그보다 높은 score >= 90 조건이 먼저 있기 때문에, 실제로 score >= 80에 도달할 때는 score가 90 미만이면서 80 이상인 경우만 남습니다.