public class test4 {
    private final String name; // 객체에 속하는 final 필드
    private final int id;

    public test4(String name, int id) {
        this.name = name;  // test4 라는 생성자(메서드) 내에서 name,id 라는 이름의 변수는 항상 매개변수와 동일하다!
        this.name="a";  // --> 오류 발생!
        this.id = id;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        test4 person1 = new test4("Alice", 1);
        test4 person2 = new test4("Bob", 2);

        System.out.println(person1.getName() + " has ID: " + person1.getId()); // Alice has ID: 1
        System.out.println(person2.getName() + " has ID: " + person2.getId()); // Bob has ID: 2

        // 아래 코드는 컴파일 에러 발생: final 필드는 변경 불가
        // person1.name = "Charlie"; 
        // person2.id = 3;
    }
}

// 자바에서 final 키워드는 변경을 금지한다는 의미로 사용됩니다.
// 이는 곧, 첫 초기화가 영원해야 한다는 것이다!(자동초기화 제외! 즉 jvm 이 아닌 사람이 초기화하는것만을 의미!)

// 메서드 내에서 매개변수와 동일한 이름의 변수를 사용하면 매개변수를 의미합니다.
// 동일한 이름의 인스턴스 변수나 클래스 변수에 접근하려면 this 또는 클래스명을 사용해야 합니다.
// 동일한 이름으로 지역 변수를 선언하려고 하면 컴파일 오류가 발생합니다.