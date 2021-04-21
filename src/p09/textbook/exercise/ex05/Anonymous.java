package p09.textbook.exercise.ex05;

public class Anonymous {
	Vehicle field = new Vehicle() {
<<<<<<< HEAD
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}








=======

		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");

		}
	};

	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");

			}
		};

		localVar.run();
	}

	void method2(Vehicle v) {
		v.run();
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
