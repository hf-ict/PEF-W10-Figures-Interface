
public class Circle extends Figure {

	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
