package p06.textbook.s061005;

public class SingletonExample {
	public static void main(String[] args) {
<<<<<<< HEAD
//		Singleton obj3 = new Singleton();
//		Singleton obj4 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
=======
		/*
		Singleton obj1 = new Singleton();  // 컴파일 에러
		Singleton obj2 = new Singleton();  // 컴파일 에러
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
