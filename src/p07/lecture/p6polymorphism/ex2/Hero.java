package p07.lecture.p6polymorphism.ex2;

public class Hero {
<<<<<<< HEAD
	private Gun gun;
=======
private Gun gun;
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
	
	public Gun getGun() {
		return gun;
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void attack() {
		System.out.println("공격!");
		gun.fire();
	}
}



