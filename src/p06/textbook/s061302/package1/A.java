package p06.textbook.s061302.package1;

public class A {
<<<<<<< HEAD
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	public A(boolean b) {
	}

	A(int b) {
	}

	private A(String s) {
	}
=======
	// 필드
	
	A a1 = new A(true);     // (o)
	A a2 = new A(1);        // (o)
	A a3 = new A("문자열"); // (o)
	
	// 생성자
	public A(boolean b) {}   // public 접근제한
	A(int b) {}              // default 접근제한
	private A(String s) {}   // private 접근제한
	

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
