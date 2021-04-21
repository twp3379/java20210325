package p05.lecture;

public class A08CallByValue {
	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		method1(i);
		method1(j);
<<<<<<< HEAD
		
		String s = "java";
		String u = new String("java");
		System.out.println(System.identityHashCode(s));
		method2(s);
		System.out.println(System.identityHashCode(u));
		method2(u);
	}
	
	public static void method1(int a) {
		System.out.println(a);
	}
	
	public static void method2(String s) {
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}
}




=======

		String s = "java";
		String u = new String("java");
		System.out.println(System.identityHashCode(s));
		method2(s);
		System.out.println(System.identityHashCode(u));
		method2(u);

	}

	public static void method1(int a) {

		System.out.println(a);

	}

	public static void method2(String s) {
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

	}
}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
