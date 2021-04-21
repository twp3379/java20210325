package p07.lecture.p6polymorphism.ex2;

public class A02Sample {
	public static void main(String[] args) {
		Hero hero = new Hero();
		
		System.out.println("기본 총 장착");
		hero.setGun(new Gun());
		
		System.out.println("적 만남");
		hero.attack();
		
		System.out.println("물총을 주웠다.");
		hero.setGun(new WaterGun());
		
		System.out.println("적 만남");
		hero.attack();
		
		System.out.println("무지개총을 주웠다.");
		hero.setGun(new RainbowGun());
		
<<<<<<< HEAD
		System.out.println("적 만남");
		hero.attack();
		
	}
}






=======
		System.out.println("적만남");
		hero.attack();
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
