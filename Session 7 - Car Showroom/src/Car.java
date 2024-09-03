
public class Car {
	protected int speed;
	protected int capacity;
	protected String carName;
	
	public Car(int _speed, int _capacity, String _name) {
		super();
		this.speed = _speed;
		this.capacity = _capacity;
		this.carName = _name;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

}
