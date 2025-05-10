class Student {
    // 인스턴스 필드: 각 학생마다 다른 이름을 가짐
    String studentName;

    // 생성자
    Student(String name) {
        this.studentName = name;    // 1. 매개변수 이름이란 필드이름이랑 같을때--> this. 필수!  2. 매개변수 이름이란 필드이름이랑 다를때--> this. 써도 되고 안써도 되고!!!
    }

    // 학생 이름 출력
    void printName() {
        System.out.println("학생 이름: " + studentName);
    }
}

public class Main1 {
    public static void main(String[] args) {
        // 두 명의 학생 생성
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // 각 학생의 이름 출력
        student1.printName();  // 출력: 학생 이름: Alice
        student2.printName();  // 출력: 학생 이름: Bob
    }
}
