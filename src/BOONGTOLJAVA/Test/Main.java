package BOONGTOLJAVA.Test;
class School {
    // static 필드: 모든 학생이 같은 학교 이름을 공유
    String schoolName = "Sunshine High School";

    // 인스턴스 필드: 각 학생마다 이름과 학번이 다름
    String studentName;
    int studentId;

    // 생성자: 학생의 이름과 학번을 설정
    School(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    // 학생 정보 출력
    void printStudentInfo() {
        System.out.println("학생 이름: " + studentName);
        System.out.println("학번: " + studentId);
        System.out.println("학교: " + schoolName);  // 모든 학생이 동일한 학교 이름을 공유
    }
}

public class Main {
    public static void main(String[] args) {
        // 첫 번째 학생
        School student1 = new School("Alice", 1001);
        student1.schoolName="강서고";
        student1.printStudentInfo();

        System.out.println();

        // 두 번째 학생
        School student2 = new School("Bob", 1002);
        student2.schoolName="양정고";
        student2.printStudentInfo();

        System.out.println();

        // 학교 이름 변경 (static 필드 변경)
       // School.schoolName = "Rainbow High School";  // 학교 이름을 변경하면 모든 학생에게 반영됨

        // 첫 번째 학생의 정보 다시 출력
        student1.printStudentInfo();

        System.out.println();

        // 두 번째 학생의 정보 다시 출력
        student2.printStudentInfo();
    }
}

