package p09.lecture;

public class A05ThisKeyword {
	int i = 0;
	
	void method() {
		System.out.println(this.i);
	}
	
	class InnerClass {
		int i = 3;
		
		void method1() {
			int i = 4;
			
			System.out.println(i);
			System.out.println(this.i);
			System.out.println(A05ThisKeyword.this.i);
		}
	}
<<<<<<< HEAD
}





=======

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
