package p06.lecture.p5static;

public class MyClass4 {
	int i = 3;
	int j;
<<<<<<< HEAD
	
	static int a = 30;
	static int b;
	
	static {
		b = 50;
		System.out.println("static block");
	}
	
	static {
		System.out.println("static block2");
	}
	
	MyClass4() {
		// 인스턴스 필드 초기화
		this.j = 5;
	}
}



=======

	static int a = 30;
	static int b;

	static {
		b = 50;
		System.out.println("static block");
	}
	
	static {
		System.out.println("static block2");
	}

	MyClass4() {
		// 인스턴스 필드 초기화
		this.j = 5;
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
