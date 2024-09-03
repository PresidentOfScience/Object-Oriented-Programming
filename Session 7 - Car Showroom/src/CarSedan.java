
public class CarSedan extends Car {
	boolean isNitroActivated;
	
	public CarSedan(int _speed, int _capacity, String _name, boolean _isNitroActivated) {
		super(_speed, _capacity, _name);
		this.isNitroActivated = _isNitroActivated;
	}
	
	public boolean isNitroActivated() {
		return isNitroActivated;
	}

	public void setNitroActivated(boolean isNitroActivated) {
		this.isNitroActivated = isNitroActivated;
	}

}
