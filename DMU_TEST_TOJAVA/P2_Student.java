package DMU_TEST_TOJAVA;

public class P2_Student extends P2_Person implements P2_PrintInterface {
    private String stuId;
    private String jeongong;
    
    public P2_Student(String name, String addr, String phone, String stuId, String jeongong) {
        super(name, addr, phone);
        this.stuId = stuId;
        this.jeongong = jeongong;
    }
    
    @Override
    public void print() {
        System.out.println("이름: " + getName());
        System.out.println("주소: " + getAddr());
        System.out.println("전화번호: " + getPhone());
        System.out.println("학번: " + stuId);
        System.out.println("전공: " + jeongong);
    }
}