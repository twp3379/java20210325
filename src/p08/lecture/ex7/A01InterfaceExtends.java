package p08.lecture.ex7;

public class A01InterfaceExtends {
	public static void main(String[] args) {
		MyInterface2 i2 = new MyInterface2() {
<<<<<<< HEAD

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void method2() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}

interface MyInterface1 {
	void method1();
}

interface MyInterface2 extends MyInterface1 {
	void method2();
}




=======
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method2() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	

}

interface MyInterface1 {
	void method1();
}

interface MyInterface2 extends MyInterface1 {
	void method2();
	
	
}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
