package p07.textbook.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
<<<<<<< HEAD
		
//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}
}






=======
		/*
		 parent.field2 = "data2"; // (불가능)
		 parent.method3();        // (불가능)
		 */
		
		Child child = (Child) parent;
		child.field2 = "yyy";     // (가능)
		child.method3();          // (가능)
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
