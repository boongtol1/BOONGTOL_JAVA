package DMU_TEST_TOJAVA;

public class P2_StudentMain {
	public static void main(String[] args) {
        // 학생 객체 생성
		P2_Student student = new P2_Student	(
            "홍길동", 
            "서울시 강남구", 
            "010-1234-5678",
            "20230001",
            "컴퓨터공학"
        );
        
        // 학생 정보 출력
        System.out.println("학생 정보:");
        System.out.println("==================");
        student.print();
    }

}
