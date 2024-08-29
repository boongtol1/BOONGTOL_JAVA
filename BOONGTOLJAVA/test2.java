import java.math.BigDecimal;

public class test2 {
    public static void main(String[] args) {
        double num = 0.1;
        System.out.println("일반 출력: " + num);

        // BigDecimal을 사용하여 정확한 값을 출력
        BigDecimal bd = new BigDecimal(num);
        System.out.println("BigDecimal 출력: " + bd.toString());

        // printf를 사용하여 20자리 소수점까지 출력
        System.out.printf("정밀도 높은 출력: %.50f%n", num);
    }
}
