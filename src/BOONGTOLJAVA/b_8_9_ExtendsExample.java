package BOONGTOLJAVA;

public class b_8_9_ExtendsExample {
    public static void main(String[] args) {
		b_8_9_InterfaceCImpl impl = new b_8_9_InterfaceCImpl();

		b_8_9_InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB();
		System.out.println();

		b_8_9_InterfaceB ib = impl;
		//ib.methodA();
		ib.methodB();
		System.out.println();

		b_8_9_InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
