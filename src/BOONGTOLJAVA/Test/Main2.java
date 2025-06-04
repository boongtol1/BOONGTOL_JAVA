package BOONGTOLJAVA.Test;
class School {
    // 정적 필드: 모든 학생이 같은 학교 이름을 공유
    static String schoolName = "Sunshine High School";

    // 인스턴스 필드: 각 학생마다 고유한 이름
    String studentName; 

    // 생성자: 학생의 이름을 받아서 초기화
    School(String studentName) {
        this.studentName = studentName;  // 
    }   
    

    // 학생의 정보 출력 메서드
    void printStudentInfo() {
        System.out.println("학생 이름: " + studentName);
        System.out.println("학교 이름: " + schoolName);  // 정적 필드 사용
    }
}

public class Main2 {
    public static void main(String[] args) {
        // 두 명의 학생 객체를 생성
        School student1 = new School("Alice");
        School student2 = new School("Bob");

        // 각 학생의 정보 출력
        student1.printStudentInfo();  // 출력: 학생 이름: Alice, 학교 이름: Sunshine High School
        student2.printStudentInfo();  // 출력: 학생 이름: Bob, 학교 이름: Sunshine High School

        // 학교 이름을 변경 (정적 필드를 변경)
        School.schoolName = "Rainbow High School";

        // 변경된 후 다시 각 학생의 정보 출력
        student1.printStudentInfo();  // 출력: 학생 이름: Alice, 학교 이름: Rainbow High School
        student2.printStudentInfo();  // 출력: 학생 이름: Bob, 학교 이름: Rainbow High School
    }
}
// 정적 필드와 인스턴스 필드의 비유적 이해?--> 사탕 통과 사탕!

