package chap06.exercises.exercise18;

public class ShopService {

	private static ShopService shopService = new ShopService();
	
	public static ShopService getInstance() {
		
		return shopService;
	}

}
