package p08.textbook.exercise.ex3;

public class soundableExample {
	public static void printSound(soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
