package DMU_TEST_TOJAVA;

public class P2_Person {
	
	private String name;
    private String addr;
    private String phone;
    
    public P2_Person(String name, String addr, String phone) {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddr() {
        return addr;
    }
    
    public String getPhone() {
        return phone;
    }

}
