import java.util.ArrayList;

public class ShowroomController {

	public static void main(String[] args) {
		ArrayList<CarSuv> carGarageSUV = new ArrayList<CarSuv>();
		ArrayList<CarSedan> carGarageSEDAN = new ArrayList<CarSedan>();
		
		// Show Menu
		
		// Get Cars
		
		// Input Cars
		CarSuv carSuv1 = new CarSuv(10, 5, "Pajero", false);
		carGarageSUV.add(carSuv1);
		
		CarSedan carSedan = new CarSedan(25, 4, "BWM 320", false);
		carGarageSEDAN.add(carSedan);
		
		System.out.println("SEDAN");
		for(CarSedan item : carGarageSEDAN) {
			System.out.println(item.carName + " speed " + item.speed);
		}
	}

}
