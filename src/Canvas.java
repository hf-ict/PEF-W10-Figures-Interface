import java.util.ArrayList;
import java.util.List;

public class Canvas {

	private List<Figure> figuren = new ArrayList<Figure>();
	
	public void addFigure(Figure figure) {
		this.figuren.add(figure);
	}
	
	public void print() {
		for(Figure f : this.figuren) {
			System.out.println(f.getColor() + ": " + f.getArea());
		}
	}
}
