package p08.textbook.s080503;

import p08.textbook.s080502.HankookTire;
import p08.textbook.s080502.Tire;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
<<<<<<< HEAD
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}



=======
		for(Tire tire : tires) {
			tire.roll();
		}
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
