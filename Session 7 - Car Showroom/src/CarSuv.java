
public class CarSuv extends Car {
	boolean isSunRoofOpen;
	
	public CarSuv(int _speed, int _capacity, String _name, boolean _isSunRoofOpen) {
		super(_speed, _capacity, _name);
		this.isSunRoofOpen = _isSunRoofOpen;
	}

	public boolean isSunRoofOpen() {
		return isSunRoofOpen;
	}

	public void setSunRoofOpen(boolean isSunRoofOpen) {
		this.isSunRoofOpen = isSunRoofOpen;
	}
	
}
