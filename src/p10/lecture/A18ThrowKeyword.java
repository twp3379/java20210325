package p10.lecture;

public class A18ThrowKeyword {
	public static void main(String[] args) {
		method1();
		
		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void method1() {
		int i = 0;
		
<<<<<<< HEAD
		if (i == 0) {
			throw new RuntimeException("i가 0입니다.");
		}
	}
	
	private static void method2() throws Exception {
		int i = 0;
		
		if (i == 0) {
			throw new Exception();
		}
	}
}





=======
		if(i == 0) {
			throw new RuntimeException();
		}
	}
	
	private static void method2() throws Exception {
		int i = 0;
		
		if(i == 0) {
			throw new Exception();
		}
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
