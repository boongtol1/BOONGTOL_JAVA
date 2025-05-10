package BOONGTOLJAVA;

public class b_5_5_IndexOfContainsExample {
    public static void main(String[] args) {
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);  // location 이 나타내는 인덱스 부터 끝까지의 문자열을 출력한다!
		System.out.println(substring);

		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}

		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}
}

// location 값이 -1이 되는 이유는 indexOf() 메서드의 반환 값 규칙에 따라 찾고자 하는 문자열이 원본 문자열에 포함되어 있지 않을 때 -1을 반환하기 때문입니다.