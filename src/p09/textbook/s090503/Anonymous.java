package p09.textbook.s090503;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
//		arg1 = 20;
//		arg2 = 20;
		
//		var1 = 30;
//		var2 = 30;
		
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
<<<<<<< HEAD
=======

>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
}
