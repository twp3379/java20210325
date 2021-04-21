package p09.textbook.s090304;

public class Outter {
<<<<<<< HEAD
	String field = "Outter-field";

	void method() {
		System.out.println("Outter-method");
	}

	class Nested {
		String field = "Nested-field";

		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
=======
	String field = "Otter-field";

	void method() {
		System.out.println("Outter-method");
	}

	class Nested {
		String field = "Nested-field";

		void method() {
			System.out.println("Nested-method");
		}

		void print() {
			System.out.println(this.field);
			this.method();

			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
