package p13.lecture;

public class A07WildCard {
	public static void main(String[] args) {
		Box7<parentGeneric7> b1 = new Box7<>();
		Box7<Generic7> b2 = new Box7<>();

//	    b1 = b2;

		Box7<? extends parentGeneric7> b3;
		b3 = b2;

		Box7<? extends Generic7> b4;
		b4 = b2;

		Box7<? super Generic7> b5;
		b5 = b2;
		b5 = b1;

		Box7<? super childGeneric7> b6;
		b6 = b2;
		b6 = b1;

	}
}

class Box7<T> {

}

class parentGeneric7 {

}

class Generic7 extends parentGeneric7 {

}

class childGeneric7 extends Generic7 {

}
