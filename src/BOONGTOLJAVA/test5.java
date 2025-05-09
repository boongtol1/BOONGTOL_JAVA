public class test5 {
    private static String staticVar = "Static Variable"; // 클래스 변수
    private String instanceVar = "Instance Variable";    // 인스턴스 변수

    public void demonstrateScope(String instanceVar) {   // 매개변수
        String localVar = "Local Variable";              // 지역 변수

        // 지역 변수 우선 (여기서는 이름 충돌 없음!)
        System.out.println("localVar: " + localVar);
        instanceVar="aa";
        // 매개변수 우선 (이름 충돌 발생)
        System.out.println("instanceVar (parameter): " + instanceVar);

        // 인스턴스 변수 (this 키워드 필요)
        System.out.println("instanceVar (field): " + this.instanceVar);

        // 클래스 변수 (클래스명으로 접근)
        System.out.println("staticVar: " + test5.staticVar);
    }

    public static void main(String[] args) {
        test5 scope = new test5();
        scope.demonstrateScope("Parameter Variable");
    }
    private static String staticVa = "Static Variable";
}
// 동일한 이름의 변수가 여러 범위에 있다 에서 범위란?--> class 내부 외부 method 외부 내부... 에서의 범위를 의미한다!!!(사진 참고!)
// 메서드 내에서 매개변수와 동일한 이름의 변수를 사용(접근)하면 매개변수를 의미합니다.(범위 내에서 유일함!)
// java에서는 같은 범위(scope) 내에서 동일한 이름의 변수를 선언할 수 없습니다. 
// 따라서 메서드 내부에서 매개변수와 동일한 이름의 지역 변수를 선언하려고 하면 컴파일 오류가 발생합니다.
// 메서드의 매개변수는 해당 메서드의 본문({})과 동일한 범위(Scope)를 공유합니다.
// 즉, 매개변수는 메서드 본문 {} 내부에 선언된 것으로 간주되며, 그 안에서만 사용(접근)할 수 있습니다.
// Java에서 범위(scope)는 변수가 유효한 코드 영역을 의미합니다.
// 변수가 선언된 블록({})이 변수의 범위를 결정합니다.
// 같은 범위는 같은 블록 내에서 변수가 선언된 경우를 의미합니다.(집합으로 생각!)
// 동일한 이름으로 지역 변수를 선언하려고 하면 컴파일 오류가 발생합니다.
// 매개변수와 지역 변수는 같은 범위(Scope) 내에서 동작하기 때문에, 같은 메서드 블록 안에서는 동일한 이름의 매개변수와 지역 변수를 선언할 수 없습니다. 
// 변수가 선언되어있는(유효한) 범위 내에서 그 변수에 접근 가능하다!
// 정의적인 변수, 입출력되는 변수 인지하는것이 중요!
// 임의의 k피종속행에 있는 입력되는 변수는 k능종속행에서 정의된 정의적인 변수와 동치다! 단 k는 최단의 음이 아닌 정수!(이해의 key?--> k의 시뮬)