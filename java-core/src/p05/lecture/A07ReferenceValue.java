package p05.lecture;

public class A07ReferenceValue {
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String u = "java";

		int sHashcode = System.identityHashCode(s);
		System.out.println(sHashcode);

		int tHasjcode = System.identityHashCode(t);
		System.out.println(tHasjcode);

		int uHashcode = System.identityHashCode(u);
		System.out.println(uHashcode);
	}
}
