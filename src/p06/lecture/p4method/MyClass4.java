package p06.lecture.p4method;

public class MyClass4 {
	void method1() {
		System.out.println("method1 호출...");
	}
<<<<<<< HEAD
	
	int method2() {
		System.out.println("method2 호출...");
		
		return 5;
	}
	
	String method3() {
		System.out.println("method3 호출...");
		
		return "";
	}
	
	int[] method4() {
		System.out.println("method4 호출...");
		return new int[] {};
	}
	
	int[] method5() {
		System.out.println("method5 호출...");
		int[] res = {};
		
		return res;
	}
	
	String method6() {
		System.out.println("method6 호출...");
		
		boolean b = 3 < 5;
		
		if (b) {
			return "hello";
		} else {
			return "hello";
		}
	}
	
	String method7() {
		
		System.out.println("method7 호출...");
		
		boolean c = 3 < 5;
		
		if (c) {
			return "world";
		}
		
		System.out.println("method7 호출2...");
		return "world";
	}
}










=======

	int method2() {
		System.out.println("method2 호출...");

		return 5;
	}

	String method3() {
		System.out.println("method3 호출...");
		return "";
	}

	int[] method4() {
		System.out.println("method4 호출...");
		return new int[] {};
	}

	int[] method5() {
		System.out.println("method5 호출...");
		int[] res = {};

		return res;
		
//		System.out.println("method call....");
	}

	String method6() {
		System.out.println("method6 호출...");
		boolean b = 3 < 5;

		if (b) {
			return "hello";
		} else {
			return "hello";
		}
	}
	String method7() {
		System.out.println("method7 호출...");
		
		boolean c = 3 < 5;
		
		if(c) {
			return "wolrd";
		}
		
		System.out.println("method7 호출2...");
		return "wolrd";
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
