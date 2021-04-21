package p06.textbook.s061303.package1;

public class A {
<<<<<<< HEAD
	public int field1;
	int field2;
	private int field3;

	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;

		method1();
		method2();
		method3();
	}

	public void method1() {
	}

	void method2() {
	}

	private void method3() {
	}
=======
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
	public void method1() {       // public 접근 제한
	}

	void method2() {              // default 접근 제한
	}

	private void method3() {      // private 접근 제한
	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
