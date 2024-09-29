package dmu_test;

public class test {
    public static void main(String[] args) {
        int numberOfApples = 123;       // 총 사과의 수
        int basketCapacity = 10;        // 하나의 바구니에 담을 수 있는 사과의 수

        // 필요한 바구니의 수 계산
        int numberOfBaskets = (numberOfApples / basketCapacity) 
                              + (numberOfApples % basketCapacity > 0 ? 1 : 0);

        // 결과 출력
        System.out.println("필요한 바구니의 수: " + numberOfBaskets);
    }
}
