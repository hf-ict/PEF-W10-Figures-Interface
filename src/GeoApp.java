
public class GeoApp {

	public static void main(String[] args) {
		Circle circle = new Circle("black", 10.5);
		Rectangle rectangle = new Rectangle("red", 5.4, 3.3);
	
		Canvas c = new Canvas();
		c.addFigure(circle);
		c.addFigure(rectangle);
		
		c.print();
	}
}
