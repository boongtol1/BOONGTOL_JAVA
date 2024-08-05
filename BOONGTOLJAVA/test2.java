package BOONGTOLJAVA;

public class test2 {
    public static void main(String[] args) {
        // 숫자 변환
        int number = Integer.parseInt(args[0]);
        System.out.println("Number: " + number);

        // 날짜 변환
        String date = args[1];
        System.out.println("Date: " + date);

        // 파일 경로
        String filePath = args[2];
        System.out.println("File Path: " + filePath);
    }
}
