package p09.lecture;

public class A04LocalClassAccess {
	void method(int param) {
		// param과 localVar는 묵시적 final(effectively fianl)
<<<<<<< HEAD
		int localVar = 3;
//		localVar = 4;
//		param = 1;
		
		class LocalClass {
			void method1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
=======
		final int localVar = 3;
//		localVar = 4;
//		param = 1;
		
		class LocalClass {
			void method1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
