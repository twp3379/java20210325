package p09.textbook.s090303;

public class Outter {
<<<<<<< HEAD

	public void method1(final int arg) {
		final int localVarialbe = 1;
//		arg = 100;
//		localVarialbe = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVarialbe;
			}
		}
	}
	
	
	public void method2(int arg) {
		int localVariale = 1;
//		arg = 100;
//		localVariale = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariale;
			}
		}
	}
}












=======
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100;              (x)
		// localVariable = 100;    (x)
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

	// 자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100;              (x)
		// localVariable = 100;    (x)
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
