package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
<<<<<<< HEAD
	void method1(int i) {
		System.out.println("method1!!!");
	}
	
	void method2(int i, int j) {
		System.out.println("method2@@@");
	}
	
	// varargs
	void method3(int... i) {
		System.out.println("method3###");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	
	void method4(double d, int... i) {
		System.out.println("method4$$$");
		
	}
}





=======
    void method1(int i) {
    	System.out.println("method1!!!");
    }
    
    void method2 (int i, int j) {
    	System.out.println("method2@@@");
    }
    // varargs
    void method3(int...i) {
    	System.out.println("method3###");
    	System.out.println(i.length);
    	System.out.println(Arrays.toString(i));
    }
    
    void method4( double d, int... i) {
    	System.out.println("method4$$$");
    }
}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
