package BOONGTOLJAVA;

public class b_8_13_SealedExample {
    public static void main(String[] args) {
		b_8_13_ImplClass impl = new b_8_13_ImplClass();

		b_8_13_InterfaceA ia = impl;
		ia.methodA();

		System.out.println();

		b_8_13_InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();

		System.out.println();

		b_8_13_InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
