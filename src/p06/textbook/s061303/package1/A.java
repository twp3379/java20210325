package p06.textbook.s061303.package1;

public class A {

	// 필드
	public int field1;
	int field2;
	private int field3;

	// 생성자
	public A() {
		field1 = 1; // (o)
		field2 = 2; // (o)
		field3 = 3; // (o)

		method1(); // (o)
		method2(); // (o)
		method3(); // (o)
	}

	// 메소드
	public void method1() { // public 접근 제한
	}

	void method2() { // default 접근 제한
	}

	private void method3() { // private 접근 제한
	}

}
