package p09.textbook.s090301;

public class A {
	// 인스턴스 필드
<<<<<<< HEAD
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드 초기화
	// static B field3 = new B();
	static C field4 = new C();
	
	// 정적 메소드
	static void method2() {
		// B var1 = new B();
		C var2 = new C();
	}
	
	// 인스턴스 멤버 클래스
	class B {}
	// 정적 멤버 클래스
	static class C{}
=======
	B field1 = new B(); // (o)
	C field2 = new C(); // (o)

	// 인스턴스 메소드
	void method1() {
		B var1 = new B(); // (o)
		C var2 = new C(); // (o)
	}

	// 정적 필드 초기화
	// static B field3 = new B(); (x)
	static C field4 = new C(); // (o)

	// 정적 메소드
	static void method2() {
		// B var1 = new B(); (x)
		C var2 = new C(); // (o)
	}

	// 인스턴스 멤버 클래스
	class B {
	}

	// 정적 멤버 클래스
	static class C {
	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
