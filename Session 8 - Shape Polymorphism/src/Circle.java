
public class Circle extends Shape {
	double radius = 20;
	
	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
