package BOONGTOLJAVA;

public class b_7_11_SealedExample {
    public static void main(String[] args) {
		b_7_11_Person p = new b_7_11_Person();
		b_7_11_Employee e = new b_7_11_Employee();
		b_7_11_Manager m = new b_7_11_Manager();
		b_7_11_Director d = new b_7_11_Director();

		p.work();
		e.work();
		m.work();
		d.work();
	}
}
