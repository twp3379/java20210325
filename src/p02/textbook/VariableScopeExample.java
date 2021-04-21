package p02.textbook;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
<<<<<<< HEAD
		
		int v3 = v1 + v2 + 5; // v2변수를 사용할 수 없기 때문에 컴파일 에러가 생김
=======
		int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
	}
}
