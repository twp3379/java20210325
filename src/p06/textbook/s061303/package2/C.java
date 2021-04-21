package p06.textbook.s061303.package2;

import p06.textbook.s061303.package1.A;

public class C {
	public C() {
		A a = new A();
<<<<<<< HEAD
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;
		
		a.method1();
		a.method2();
		a.method3();
=======
		a.field1 = 1; // (o)
//		a.field2 = 1; // (x)    default 필드 접근 불가
//		a.field3 = 1; // (x)    private 필드 접근 불가

		a.method1();  // (o)
//		a.method2();  // (x)    default 메소드 접근 불가
//		a.method3();  // (x)    private 메소드 접근 불가

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
	}
}
