package p09.lecture;

public class A06AnonymousClass {
	public static void main(String[] args) {
		int localVar = 3;
<<<<<<< HEAD
//		localVar = 4;
		
//		args = new String[] {};
		
		MyInterface i1 = new MyInterface() {
			void method() {
				System.out.println(localVar);
				System.out.println(args);
			}
		};
		
=======
		
//		localVar = 4;
		
//		args = new String[] {};
		
		MyInterface i1 = new MyInterface() {
			void method() {
				System.out.println(localVar);
				System.out.println(args);
			}
		};

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
	}
}
