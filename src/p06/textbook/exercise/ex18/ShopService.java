package p06.textbook.exercise.ex18;

<<<<<<< HEAD
public class ShopService {
	private static ShopService shopService;
=======

public class ShopService {
	
private static ShopService shopService;
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
	
	private ShopService() {
		
	}

	public static ShopService getInstance() {
		if (shopService == null) {
			shopService = new ShopService();
		}
		
		return shopService;
	}

}
