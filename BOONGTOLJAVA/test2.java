public class test2 {
    public static void main(String[] args) {
        System.out.println("인수 출력:");
        // 배열의 각 요소를 순회하여 출력
        for (int i = 0; i < args.length; i++) {
            System.out.println("인수 " + i + ": " + args[i]);
        }
    }
}
