package BOONGTOLJAVA;

public class b_4_3_SwitchCharExample {
    public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;							
			default:
				System.out.println("손님입니다.");
		}
	}
}
// switch 문은 순차적으로 case를 평가하지 않으며, 표현식의 값에 따라 직접 해당 case로 이동합니다. --> if 문과의 차이점 중 하나! 
// break가 없는 경우, 해당 case 블록이 끝난 후 다음 case 블록들이 차례로 실행되는 현상이 발생합니다. 이 현상을 fall-through라고 합니다.
// switch 문에서 default는 주어진 값이 어느 case와도 일치하지 않을 때 실행되는 코드 블록입니다. 즉, 모든 case에 해당하지 않을 때 실행되는 "기본" 동작을 정의하는 블록입니다. 
// default는 선택 사항이지만, 주로 예상치 못한 입력값에 대해 적절한 처리를 하기 위해 사용됩니다.